package org.codeoverflow.chatoverflow.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to specify, that this interface can be used are (input / output / parameter) requirement type.
 * Based on this annotation, the requirement API is generated, visible to plugin developers.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface IsRequirement {

    /**
     * You can define the generated method name by yourself. If left empty, the name is generated like this:
     * "StringParameter" -> "string" or "TwitchChatInput" -> "twitchChat"
     */
    String methodName() default "";

    /**
     * Each generated methods javadoc starts with "Requires a [foo], which has to be specified by the user."
     * You can define, what [foo] is required. If left empty, the string is generated without additional information.
     */
    String requires() default "";

}
