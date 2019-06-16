package org.codeoverflow.chatoverflow.api.io.dto.subscription.twitch;


import org.codeoverflow.chatoverflow.api.io.dto.User;
import org.codeoverflow.chatoverflow.api.io.dto.chat.twitch.TwitchChatMessage;

public class TwitchSubscription {
    enum SubscriptionContext {
        SUB, RESUB, SUBGIFT, SUBGIFT_ANONYM, UNKNOWN
    }

    private final User subscriber;
    private final String channelName;
    private final String channelID;
    private final Long timestamp;
    private final TwitchSubscriptionPlan subPlan;
    private final int months;
    private final SubscriptionContext context;
    private final TwitchChatMessage subMessage;
    private final User subDonor;

    /**
     * @param subPlan valid parameters: "Prime", "1000", "2000", "3000"
     * @param subContext valid parameters: "sub", "resub", "subgift", "anonsubgift"
     */
    public TwitchSubscription(User subscriber, String channelName, String channelID, Long timestamp,
                              String subPlan, String subPlanName, int months, String subContext,
                              TwitchChatMessage subMessage) {
        this(subscriber, channelName, channelID, timestamp, subPlan, subPlanName, months, subContext,
                subMessage, null);
    }

    /**
     * @param subPlan valid parameters: "Prime", "1000", "2000", "3000"
     * @param subContext valid parameters: "sub", "resub", "subgift", "anonsubgift"
     */
    public TwitchSubscription(User subscriber, String channelName, String channelID, Long timestamp,
                              String subPlan, String subPlanName, int months, String subContext,
                              TwitchChatMessage subMessage, User subDonor) {
        this(subscriber, channelName, channelID, timestamp, new TwitchSubscriptionPlan(subPlan, subPlanName,
                channelID, channelName), months, convertTo(subContext), subMessage, subDonor);
    }

    public TwitchSubscription(User subscriber, String channelName, String channelID, Long timestamp,
                              TwitchSubscriptionPlan subPlan, int months, SubscriptionContext context,
                              TwitchChatMessage subMessage) {
        this(subscriber, channelName, channelID, timestamp, subPlan, months, context, subMessage, null);
    }

    public TwitchSubscription(User subscriber, String channelName, String channelID, Long timestamp,
                              TwitchSubscriptionPlan subPlan, int months, SubscriptionContext context,
                              TwitchChatMessage subMessage, User subDonor) {
        this.subscriber = subscriber;
        this.channelName = channelName;
        this.channelID = channelID;
        this.timestamp = timestamp;
        this.subPlan = subPlan;
        this.months = months;
        this.context = context;
        this.subMessage = subMessage;
        this.subDonor = subDonor;
    }

    /**
     * @return user who subscribed to the channel
     */
    public User getSubscriber() {
        return subscriber;
    }

    /**
     * @return name of the channel the user subscribed to
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @return id of the channel the user subscribed to
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * @return time of the subscription
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * @return the subscription plan
     */
    public TwitchSubscriptionPlan getSubPlan() {
        return subPlan;
    }

    /**
     * @return amount of subscribed months to the specific channel
     */
    public int getMonths() {
        return months;
    }

    /**
     * @return the context of the subscription, e.g. gifted, resubbed
     */
    public SubscriptionContext getContext() {
        return context;
    }

    /**
     * the author of the chat message can also be the subscription donor
     * @return (Optional) the chat message when subbing or gifting
     */
    public TwitchChatMessage getSubMessage() {
        return subMessage;
    }

    /**
     * @return (Optional) subscription donor when not an anonym sub gift
     */
    public User getSubDonor() {
        return subDonor;
    }

    /**
     * @return where subscription was gifted or not
     */
    public boolean isGifted() {
        return context.equals(SubscriptionContext.SUBGIFT) || context.equals(SubscriptionContext.SUBGIFT_ANONYM);
    }

    /**
     * @return where the subcription was done with Twitch Prime
     */
    public boolean isTwitchPrime() {
        return subPlan.isTwitchPrime();
    }

    /**
     * @param subscriptionContext valid parameters: "sub", "resub", "subgift", "anonsubgift"
     */
    static public SubscriptionContext convertTo(String subscriptionContext){
        switch(subscriptionContext) {
            case "sub": return SubscriptionContext.SUB;
            case "resub": return SubscriptionContext.RESUB;
            case "subgift": return SubscriptionContext.SUBGIFT;
            case "anonsubgift": return SubscriptionContext.SUBGIFT_ANONYM;
            default: return SubscriptionContext.UNKNOWN;
        }
    }
}
