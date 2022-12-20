package com.shpp.bot.strategy;

import com.shpp.adapter.TextMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.Collections;
import java.util.LinkedList;

public class StartMessage {

    public TextMessage getKeyboard() {
        TextMessage textMessage = new TextMessage();
        KeyboardRow keyboardButtons = new KeyboardRow();
        keyboardButtons.add("With Time Limit");
        keyboardButtons.add("Without Limits");
        KeyboardRow keyboardButtons1 = new KeyboardRow();
        keyboardButtons1.add("Without limits");
        textMessage.setReplyMarkup(keyboard());
        return textMessage;
    }

    public static InlineKeyboardMarkup keyboard() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();

        inlineKeyboardButton.setText("With time limit");
        inlineKeyboardButton.setCallbackData("a");

        inlineKeyboardButton2.setText("With mistake limit");
        inlineKeyboardButton2.setCallbackData("b");

        inlineKeyboardButton3.setText("Without limits");
        inlineKeyboardButton3.setCallbackData("c");
        LinkedList<InlineKeyboardButton> keyboardRows = new LinkedList<>();
        keyboardRows.add(inlineKeyboardButton);
        keyboardRows.add(inlineKeyboardButton2);
        keyboardRows.add(inlineKeyboardButton3);

        inlineKeyboardMarkup.setKeyboard(Collections.singletonList(keyboardRows));
        return inlineKeyboardMarkup;
    }
}
