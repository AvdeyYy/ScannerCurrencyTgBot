package com.example.ValueScannerBot.botConfig;
import com.example.ValueScannerBot.dto.CourseDto;
import com.example.ValueScannerBot.enums.ButtonEnum;
import com.example.ValueScannerBot.enums.MessageEnum;
import com.example.ValueScannerBot.service.CourseParserService;
import com.example.ValueScannerBot.service.DtoService;
import com.example.ValueScannerBot.telegram.keyboards.ReplyKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@Component
public class CryptoScannerBot extends TelegramLongPollingBot {
    @Autowired
    ReplyKey replyKey;

    @Autowired
    DtoService dtoService;
    @Autowired
    CourseParserService parserService;

    @Value("${bot.username}")
    private String botUsername;

    @Value("${bot.token}")
    private String botToken;




    @Override
    public void onUpdateReceived(Update update) {

        String message = update.getMessage().getText();
        String chatId = update.getMessage().getChatId().toString();

        if (message.equals("/start")) {
            sendMessage(chatId,MessageEnum.START_COMMAND);
        } else if (message.equals(ButtonEnum.HELP_BUTTON.getButton())) {
            sendMessage(chatId,MessageEnum.HElP);
        } else if (message.equals(ButtonEnum.GET_CURRENT_COURSE.getButton())) {
            sendMessage(chatId,MessageEnum.CURRENT_ACTUALLY);
        } else if (message.equals("/start2")) {
            dtoService.save(parserService.currentValues("ETH"));
        }

    }




    private void sendMessage(String chatId, MessageEnum messageEnum) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(String.valueOf(messageEnum.getMessage()));
        sendMessage.setReplyMarkup(replyKey.getMenu());
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }
}
