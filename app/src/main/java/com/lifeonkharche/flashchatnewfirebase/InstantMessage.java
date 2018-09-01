package com.lifeonkharche.flashchatnewfirebase;

public class InstantMessage {

    private String message;
    private String author;
    private String reminder;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {
    }
    public InstantMessage(String reminder) {
        this.reminder = reminder;
    }

    public String getMessage() {
        return message;
   }

    public String getAuthor() {
        return author;
    }

    public String getReminder() {
        return reminder;
    }
}
