package org.codeoverflow.chatoverflow.api.io.dto.subscription.twitch;

public class TwitchSubscriptionPlan {
    enum Type {
        TWITCH_PRIME(0), TIER1(4.99), TIER2(9.99), TIER3(24.99), UNKNOWN(-1);

        private double price;

        Type(double price) {
            this.price = price;
        }

        /**
         * @return price of subscription plan in USD per month
         */
        double getPrice() {
            return price;
        }
    }

    private final Type type;
    private final String name;
    private final String channelID;
    private final String channelName;


    public TwitchSubscriptionPlan(String type, String name, String channelID, String channelName) {
        this(convertTo(type), name, channelID, channelName);
    }

    public TwitchSubscriptionPlan(Type type, String name, String channelID, String channelName) {
        this.type = type;
        this.name = name;
        this.channelID = channelID;
        this.channelName = channelName;
    }

    /**
     * @return the type of the subscription plan, e.g. free TwitchPrime subscription
     */
    public Type getType() {
        return type;
    }

    /**
     * @return the name of the subscription plan on the specific channel
     */
    public String getName() {
        return name;
    }

    /**
     * @return channel ID that was subscribed to
     */
    public String getChannelID() {
        return channelID;
    }

    /**
     * @return channel name that was subscribed to
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @return where the subcription was done with Twitch Prime
     */
    public boolean isTwitchPrime() {
        return type.equals(Type.TWITCH_PRIME);
    }

    /**
     * @param subscriptionPlan valid parameters: "Prime", "1000", "2000", "3000"
     */
    static public Type convertTo(String subscriptionPlan) {
        switch(subscriptionPlan) {
            case "PRIME": return Type.TWITCH_PRIME;
            case "1000": return Type.TIER1;
            case "2000": return Type.TIER2;
            case "3000": return Type.TIER3;
            default: return Type.UNKNOWN;
        }
    }
}
