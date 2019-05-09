package org.codeoverflow.chatoverflow.api.io.output.file;

import org.codeoverflow.chatoverflow.api.io.input.chat.ChatMessage;
import org.codeoverflow.chatoverflow.api.io.output.Output;

import java.util.List;

public interface ChatFileOutput<T extends ChatMessage> extends Output {
    void save(String fileName, List<T> chatMessages);
}