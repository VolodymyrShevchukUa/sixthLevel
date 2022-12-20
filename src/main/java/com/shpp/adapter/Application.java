package com.shpp.adapter;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;

public class Application {


    public static final long CHAT_ID = 123123L;

    public static void main(String[] args) {

        SendPhoto sendPhoto = new SendPhoto();
        SendMessage sendMessage = new SendMessage();

        TextMessage textMessage = new TextMessage();
        PhotoMessage photoMessage = new PhotoMessage();

        sendResponse(textMessage);
        sendResponse(photoMessage);

    }



    public static void sendResponse(IMessage iMessage){

        iMessage.setChatId(CHAT_ID);
    }

    public static void DefSendResponse(SendPhoto sendPhoto){
        sendPhoto.setChatId(CHAT_ID);

        System.out.println("I am sending photo");
    }

    public static void DefSendText(SendMessage sendMessage){
        sendMessage.setChatId(CHAT_ID);
        System.out.println("I am sending message");
    }



}
