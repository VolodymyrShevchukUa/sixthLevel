package com.shpp.adapter;

import org.telegram.telegrambots.meta.api.objects.Update;

public class InstanceRealization {

    private final Update update;

    public InstanceRealization(Update update) {
        this.update = update;
    }

    public long getChatId() {
        long chatId;
        if (update.hasCallbackQuery()) {
            chatId = update.getCallbackQuery().getMessage().getChatId();
        } else if (update.hasMessage()) {
            chatId = update.getMessage().getChatId();
        } else {
            throw new UnsupportedOperationException("not implemented yet");
        }
        return chatId;
    }
}
