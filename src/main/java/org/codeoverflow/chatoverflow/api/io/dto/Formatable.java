package org.codeoverflow.chatoverflow.api.io.dto;

/**
 * Can be formatted by using HTML or markdown
 */
public interface Formatable {

    /**
     * @return the string formatted using HTML
     */
    String toHTMLString();

    /**
     * @return the string formatted using markdown
     */
    String toMarkdownString();

}
