package com.example.ValueScannerBot.enums;

import jakarta.ws.rs.PUT;

public enum ButtonEnum {

    HELP_BUTTON("Help"),
    GET_CURRENT_COURSE("Get actually course");

    private final String button;

    ButtonEnum(String button) {
        this.button = button;
    }
    public String getButton() {
        return button;
    }



}
