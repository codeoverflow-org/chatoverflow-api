package org.codeoverflow.chatoverflow.api.io.dto.chat.discord;

import java.awt.Color;
import java.time.OffsetDateTime;
import java.util.*;

/**
 * Discord chat messages may contain <a href="https://leovoel.github.io/embed-visualizer/">fancy embeds </a>,
 * this class contains all information about one
 */
public class DiscordEmbed {

    /**
     * Get a new Builder that helps you with the creation of your own embeds
     */
    public static Builder Builder() {
        return new Builder();
    }

    private final String title;
    private final String description;
    private final String url;
    private final String color;
    private final OffsetDateTime time;
    private final String footerIconUrl;
    private final String footerText;
    private final String thumbnailUrl;
    private final String imageUrl;
    private final String auhthorName;
    private final String auhthorUrl;
    private final String auhthorIconUrl;
    private final List<Field> fields;

    public DiscordEmbed(String title,
                        String description,
                        String url, String color,
                        OffsetDateTime time,
                        String footerIconUrl,
                        String footerText,
                        String thumbnailUrl,
                        String imageUrl,
                        String auhthorName,
                        String auhthorUrl,
                        String auhthorIconUrl,
                        List<Field> fields) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.color = color;
        this.time = time;
        this.footerIconUrl = footerIconUrl;
        this.footerText = footerText;
        this.thumbnailUrl = thumbnailUrl;
        this.imageUrl = imageUrl;
        this.auhthorName = auhthorName;
        this.auhthorUrl = auhthorUrl;
        this.auhthorIconUrl = auhthorIconUrl;
        this.fields = fields;
    }

    /**
     * Returns the title of the embed
     *
     * @return optional container with the title of the embed or an empty optional if there is no title
     */
    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }

    /**
     * Returns the description of the embed.
     * This is where the main chunk of text for an embed is typically placed.
     *
     * @return optional container with the description or an empty optional if there is no description
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    /**
     * Returns the url to which the title links
     *
     * @return optional container with the url or an empty optional if the title isn't a hyperlink
     */
    public Optional<String> getUrl() {
        return Optional.ofNullable(url);
    }

    /**
     * Returns the color of the embed as hex code, starting with a '#'
     *
     * @return optional container with the color of the embed or an empty optional if there is no color set
     */
    public Optional<String> getColor() {
        return Optional.ofNullable(color);
    }

    /**
     * Returns the time of the embed (value in epoch millis)
     *
     * @return optional container with the time of the embed or an empty optional if there was none provided
     */
    public Optional<OffsetDateTime> getTime() {
        return Optional.ofNullable(time);
    }

    /**
     * Returns the url of the icon that is displayed in the footer
     *
     * @return optional container with the icon url or an empty optional if there is no icon displayed
     */
    public Optional<String> getFooterIconUrl() {
        return Optional.ofNullable(footerIconUrl);
    }

    /**
     * Returns the text written in the footer of the embed
     *
     * @return optional container with the footer text or an empty optional if there is no text in the footer
     */
    public Optional<String> getFooterText() {
        return Optional.ofNullable(footerText);
    }

    /**
     * Returns the url of the thumbnail image (the image that is displayed in the upper right corner of the embed)
     *
     * @return optional container with the thumbnail url or an empty optional if there is no thumbnail image
     */
    public Optional<String> getThumbnailUrl() {
        return Optional.ofNullable(thumbnailUrl);
    }

    /**
     * Returns the url of the large image that is displayed in the embed
     *
     * @return optional container with the image url or an empty optional if there is no image
     */
    public Optional<String> getImageUrl() {
        return Optional.ofNullable(imageUrl);
    }

    /**
     * Returns the name of the embed author, displayed in bold in the first line of the embed
     *
     * @return optional container with the authors name or an empty optional if no author is provided
     */
    public Optional<String> getAuhthorName() {
        return Optional.ofNullable(auhthorName);
    }

    /**
     * Returns the url to which the author name links
     *
     * @return optional container with the url or an empty optional if the authors name is not a hyperlink
     */
    public Optional<String> getAuhthorUrl() {
        return Optional.ofNullable(auhthorUrl);
    }

    /**
     * Returns the url of the authors avatar
     *
     * @return optional container with the url of the avatar or an empty optional if there is no avatar displayed
     */
    public Optional<String> getAuhthorIconUrl() {
        return Optional.ofNullable(auhthorIconUrl);
    }

    /**
     * Returns a list of all fields displayed inside the embed
     *
     * @return a list of all fields, may be empty if there are no fields
     */
    public List<Field> getFields() {
        return fields;
    }

    /**
     * A text field inside an embed, they are structured in paragraphs and each can have a title and a description.
     */
    public static class Field {
        private final String name;
        private final String value;
        private final boolean inline;

        /**
         * Creates a new blank field.
         * <p>
         * <a href="http://i.imgur.com/tB6tYWy.png">Example for inline=true</a><br>
         * <a href="http://i.imgur.com/lQqgH3H.png">Example for inline=false</a><br>
         *
         * @param inline true if the field should be displayed in line with other fields, false if not
         */
        public Field(boolean inline) {
            this(null, null, inline);
        }

        /**
         * Creates a new field object with a title and a description, that is <b>not</b> displayed in line.<br>
         * See: {@link #Field(String, String, boolean)}
         *
         * @param name the title of the field
         * @param value the description of the field
         */
        public Field(String name, String value) {
            this(name, value, false);
        }

        /**
         * Creates a new field object with a title and a description that ca either be displayed in line with other fields
         * or has it's on paragraph
         *
         * @param name the title of the field
         * @param value the description of the field
         * @param inline true if the field should be displayed in line with other fields, false if not
         */
        public Field(String name, String value, boolean inline) {
            this.name = name;
            this.value = value;
            this.inline = inline;
        }

        /**
         * Returns the fields title, also referred to as field name
         *
         * @return optional container with the name of the field or an empty optional if blank
         */
        public Optional<String> getName() {
            return Optional.ofNullable(name);
        }

        /**
         * Returns the fields description, also referred to as field value
         *
         * @return optional container with the value of the field or an empty optional if blank
         */
        public Optional<String> getValue() {
            return Optional.ofNullable(value);
        }

        /**
         * States if the field is displayed in one line with other fields or if every field is in a new line
         *
         * @return true if in line with other fields, false if not
         */
        public boolean isInline() {
            return inline;
        }
    }

    /**
     * A helper class that simplifies the creation of your own embeds
     */
    public static class Builder {

        private String title = null;
        private StringBuilder description = null;
        private String url = null;
        private String color = null;
        private OffsetDateTime time = null;
        private String footerIconUrl = null;
        private String footerText = null;
        private String thumbnailUrl = null;
        private String imageUrl = null;
        private String auhthorName = null;
        private String auhthorUrl = null;
        private String auhthorIconUrl = null;
        private List<Field> fields = new ArrayList<>();

        /**
         * Sets the title of the embed.<br>
         * If this is not set, the title will not appear in the embed.<br>
         * Use {@link #withTitle(String, String)} if you want it to be a hyperlink
         *
         * @param title the title of the embed
         * @return the builder after the title has been set
         */
        public Builder withTitle(String title) {
            return withTitle(title, null);
        }

        /**
         * Sets the title of the embed and makes it into a hyperlink pointed at this url.<br>
         * If this is not set, the description will not appear in the embed.
         *
         * @param title the title of the embed
         * @param url   the url to which the tile links
         * @return the builder after the title has been set
         */
        public Builder withTitle(String title, String url) {
            this.title = title;
            this.url = url;
            return this;
        }

        /**
         * Sets the description of the embed.<br>
         * If this is not set, the description will not appear in the embed.
         * This is where the main text for an embed is typically placed.
         *
         * @param description the description of the embed
         * @return the builder after the description has been set
         */
        public Builder withDescription(String description) {
            this.description = new StringBuilder(description);
            return this;
        }

        /**
         * Sets the description of the embed.<br>
         * If this is not set, the description will not appear in the embed.
         * This is where the main text for an embed is typically placed.<br>
         * This method allows modifying the description by appending to the string builder till {@link #build()} is called
         *
         * @param description a string builder used to build the description of the event
         * @return the builder after the description has been set
         */
        public Builder withDescription(StringBuilder description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the color of the embed.
         *
         * @param color the color of the embed, as hex string starting with a #
         * @return the builder after the color has been set
         */
        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        /**
         * Sets the color of the embed.
         *
         * @param color the color of the embed
         * @return the builder after the color has been set
         */
        public Builder withColor(Color color) {
            this.color = String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
            return this;
        }

        /**
         * Sets the time of the embed.<br>
         * If this is not set, the time will not appear in the embed.
         * <p>
         * <b>Tip:</b><br>
         * Get the current time with {@link OffsetDateTime#now()}
         *
         * @param time the time of the embed (value in epoch millis)
         * @return the builder after the time has been set
         */
        public Builder withTimestamp(OffsetDateTime time) {
            this.time = time;
            return this;
        }

        /**
         * Sets the footer of the embed.<br>
         * If this is not set, the footer will not appear in the embed.<br>
         * Use {@link #withTitle(String, String)} if you want to display a small icon inside the footer
         *
         * @param text the text of the footer of the embed.
         * @return the builder after the footer has been set
         */
        public Builder withFooter(String text) {
            return withFooter(text, null);
        }

        /**
         * Sets the footer of the embed.<br>
         * If this is not set, the footer will not appear in the embed.
         *
         * @param text    the text of the footer of the embed.
         * @param iconUrl the url of the icon that should be displayed in the footer
         * @return the builder after the footer has been set
         */
        public Builder withFooter(String text, String iconUrl) {
            this.footerText = text;
            this.footerIconUrl = url;
            return this;
        }

        /**
         * Sets the thumbnail of the embed. (the image that is displayed in the upper right corner of the embed)<br>
         * If this is not set, the thumbnail will not appear in the embed.
         *
         * @param thumbnailUrl the url of the thumbnail
         * @return the builder after the thumbnail has been set
         */
        public Builder withThumbnail(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        /**
         * Sets the large image that is displayed inside the embed<br>
         * If this is not set, the image will not appear in the embed.
         *
         * @param imageUrl the url of the image
         * @return the builder after the image has been set
         */
        public Builder withImage(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Sets the name and the url of the embed author, displayed in bold in the first line of the embed<br>
         * If this is not set, the author will not appear in the embed.<br>
         * Use {@link #withAuthor(String, String)} to also set the authors url<br>
         * Use {@link #withAuthor(String, String, String)} to also set the authors url and avatar
         *
         * @param name the name of the author
         * @return the builder after the author has been set
         */
        public Builder withAuthor(String name) {
            return withAuthor(name, null, null);
        }

        /**
         * Sets the name and the url of the embed author, displayed in bold in the first line of the embed<br>
         * If this is not set, the author will not appear in the embed.<br>
         * Use {@link #withAuthor(String, String, String)} to also set the authors avatar
         *
         * @param name the name of the author
         * @param url  the url of the author of the embed
         * @return the builder after the author has been set
         */
        public Builder withAuthor(String name, String url) {
            return withAuthor(name, url, null);
        }

        /**
         * Sets the name, the url and the avatar of the embed author, displayed in bold in the first line of the embed<br>
         * If this is not set, the author will not appear in the embed.
         *
         * @param name    the name of the author
         * @param url     the url of the author of the embed
         * @param iconUrl the url of the icon for the author
         * @return the builder after the author has been set
         */
        public Builder withAuthor(String name, String url, String iconUrl) {
            this.auhthorName = name;
            this.auhthorUrl = url;
            this.auhthorIconUrl = iconUrl;
            return this;
        }

        /**
         * Adds a {@link Field} to this embed.
         *
         * @param field the field that is appended to the embed
         * @return the builder after the field has been added
         */
        public Builder withField(Field field) {
            this.fields.add(field);
            return this;
        }

        /**
         * Creates a new embed from this builder.
         *
         * @return a new embed
         */
        public DiscordEmbed build() {
            return new DiscordEmbed(title,
                    description.toString(),
                    url,
                    color,
                    time,
                    footerIconUrl,
                    footerText,
                    thumbnailUrl,
                    imageUrl,
                    auhthorName,
                    auhthorUrl,
                    auhthorIconUrl,
                    fields);
        }
    }
}
