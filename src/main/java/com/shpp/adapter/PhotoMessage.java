package com.shpp.adapter;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;

public class PhotoMessage implements IMessage {

    SendMessage sendMessage = new SendMessage();
// Реалізація через екземпляр?

    @Override
    public void setChatId(@NonNull Long chatId) {
        sendMessage.setChatId(chatId);
    }
}
