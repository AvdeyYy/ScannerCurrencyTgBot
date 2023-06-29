//package com.example.ValueScannerBot.telegram.handler;
//import com.example.ValueScannerBot.enums.ButtonEnum;
//import com.example.ValueScannerBot.enums.MessageEnum;
//import com.example.ValueScannerBot.telegram.keyboards.ReplyKey;
//import lombok.AccessLevel;
//import lombok.RequiredArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.api.objects.Message;
//import org.telegram.telegrambots.meta.api.objects.Update;
//
//@Component
//@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
//@RequiredArgsConstructor
//public class MessageHandler {
//    @Autowired
//    ReplyKey replyKey;
//    public SendMessage receivedMessage(Message message) {
//        String chatId = message.getChatId().toString();
//        String receivedText = message.getText();
//
//        if (receivedText == null) {
//             throw new RuntimeException();
//        } else if (receivedText.equals("/start")) {
//            return getStartMessage(chatId);
//        } else if (receivedText.equals(ButtonEnum.HELP_BUTTON.getButton())) {
//            return new SendMessage(chatId,MessageEnum.HElP.getMessage());
//        } else {
//            return new SendMessage(chatId, MessageEnum.COMMAND_NOT_EXIST.getMessage());
//        }
//    }
//
//    private SendMessage getCourse(String chatId) {
//        SendMessage sendMessage = new SendMessage(chatId, MessageEnum.CURRENT_ACTUALLY.getMessage());
//        sendMessage.enableMarkdown(true);
//        sendMessage.setReplyMarkup(replyKey.getMenu());
//        return sendMessage;
//    }
//
//    private SendMessage getStartMessage(String chatId) {
//        SendMessage sendMessage = new SendMessage(chatId, MessageEnum.HElP.getMessage());
//        sendMessage.enableMarkdown(true);
//        sendMessage.setReplyMarkup(replyKey.getMenu());
//        return sendMessage;
//    }
//}
