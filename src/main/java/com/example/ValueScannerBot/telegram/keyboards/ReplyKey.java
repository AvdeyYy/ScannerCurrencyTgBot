package com.example.ValueScannerBot.telegram.keyboards;

import com.example.ValueScannerBot.enums.ButtonEnum;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReplyKey {
    public ReplyKeyboardMarkup getMenu() {
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton(ButtonEnum.HELP_BUTTON.getButton()));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton(ButtonEnum.GET_CURRENT_COURSE.getButton()));

        List<KeyboardRow> keyboard = new ArrayList<>();
        keyboard.add(row1);
        keyboard.add(row2);

        final ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);


        return replyKeyboardMarkup;
    }
}
