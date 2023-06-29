package com.example.ValueScannerBot.enums;

public enum MessageEnum {
    HElP("Я тут помогаю если что"),
    START_COMMAND("Привет, я тупой бот"),
    COMMAND_NOT_EXIST("Command not exist"),
    CURRENT_ACTUALLY("XXX");

    private final String message;

    MessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
