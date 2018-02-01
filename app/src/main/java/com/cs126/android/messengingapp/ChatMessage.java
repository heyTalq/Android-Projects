package com.cs126.android.messengingapp;

import java.util.Date;

/**
 * Created by Tiger on 5/1/17.
 */

public class ChatMessage {
    private String messageText;
    private String author;
    private long messageTime;


    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    public ChatMessage() {
    }

    ChatMessage(String messageText, String author) {
        this.messageText = messageText;
        this.author = author;

        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }


    public String getMessageText() {
        return messageText;
    }

    public String getAuthor() {
        return author;
    }

    public long getMessageTime() {
        return messageTime;
    }


}
