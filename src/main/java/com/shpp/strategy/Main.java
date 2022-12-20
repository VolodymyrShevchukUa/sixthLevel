package com.shpp.strategy;

import com.shpp.adapter.TextMessage;
import com.shpp.bot.strategy.StartMessage;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.LinkedList;

public class Main extends TelegramLongPollingBot {

    private final String BOT_NAME = "PatternTest";
    private final String BOT_TOKEN = "5737390653:AAHoNyG-ZwGXDVeu5SM5q0m4iWPE-pLAKNs";

    private Test test;

    public static void main(String[] args) {

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new Main());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasCallbackQuery()) {
            callBackHandler(update);
        } else if (update.hasMessage()) {
            textHandler(update);
        }
    }

    public void callBackHandler(Update update) {
        String response = update.getCallbackQuery().getData();
        test = EnumOfTests.getTestByButton(response);
        String answer = test.startTest(update);
        TextMessage textMessage = new TextMessage();
        textMessage.setChatId(update.getCallbackQuery().getMessage().getChatId());
        textMessage.setText(answer);
        try {
            execute(textMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void textHandler(Update update) {

        long chatId = update.getMessage().getChatId();
        SendMessage textMessage = new StartMessage().getKeyboard();
        textMessage.setChatId(chatId);
        textMessage.setText("Please, make your chose");
        try {
            execute(textMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }

    public SendMessage getSendMessage() {
        SendMessage sendMessage = new SendMessage();
        LinkedList<KeyboardRow> keyboardRows = new LinkedList<>();
        LinkedList<KeyboardButton> keyboardButtons = new LinkedList<>();
        keyboardButtons.add(new KeyboardButton("test"));
        keyboardRows.add(new KeyboardRow(keyboardButtons));
        ReplyKeyboardMarkup replyKeyboardMarkup = ReplyKeyboardMarkup
                .builder()
                .oneTimeKeyboard(true)
                .selective(true)
                .keyboard(keyboardRows)
                .build();
        return sendMessage;
    }

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }
}
