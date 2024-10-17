package org.example;

import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;



public class MyBotService {
    public SendMessage sendMessage(Long chatID) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatID);
        sendMessage.setText("Muhammadqodir");
        SendPhoto sendPhoto = new SendPhoto();

        return sendMessage;
    }

    public SendPhoto sendPhoto(Long chatid) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatid);
        sendPhoto.setPhoto(new InputFile("https://images.app.goo.gl/x5BU8BJcPuPbDKa26"));
        sendPhoto.setCaption("hi");
        sendPhoto.setHasSpoiler(true);

        return sendPhoto;
    }

    public SendDice sendDice(Long chatid) {
        SendDice sendDice = new SendDice();
        sendDice.setChatId(chatid);
        return sendDice;
    }


    public SendMessage replayButton(Long ChatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(ChatId);
        sendMessage.setText(" Buttonlardan birini tanlang : ");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("button1");
        row.add(button);
        rowList.add(row);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("button2");
        row.add(button1);

        rowList.add(row1);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendPhoto inlineButton(Long chatId) {
        SendPhoto sendMessage = new SendPhoto();
        sendMessage.setChatId(chatId);
        sendMessage.setHasSpoiler(true);
        sendMessage.setCaption(" Birorta buttonni tanlang");
        sendMessage.setPhoto(new InputFile("https://images.app.goo.gl/sDVYf9Zb62DWyjfbA"));
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" Inline");
        button.setCallbackData("change");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }


    public SendMessage replyButton(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose one button");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button.setText("til");
        button1.setText("menu");
        button2.setText("exit");
        row.add(button1);
        row.add(button);
        row.add(button2);
        rowList.add(row);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage inlineKeybordd(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Birorta buttonni tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button.setText("rasm");
        button.setCallbackData("rasm");
        button1.setText("menu");
        button1.setCallbackData("menu");
        button2.setText("exit");
        button2.setCallbackData("exit");
        row.add(button);
        row.add(button1);
        row.add(button2);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage enterName(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ismingizni kiriting : ");
        return sendMessage;
    }

    public SendMessage enterPhoneNumber(Long chatid){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatid);
        sendMessage.setText("Telefon raqamingizni kiriting : ");
        return sendMessage;
    }

    public SendLocation enterLocation(Long chatid){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setLatitude(0d);
        sendLocation.setLongitude(0d);
        sendLocation.setChatId(chatid);
        return sendLocation;
    }




    public SendMessage sendText(Long chatid, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(text);
        sendMessage.setChatId(chatid);
        return sendMessage;
    }





    public SendMessage edit1(Long chatiid){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatiid);
        sendMessage.setText(" Quyidagilardan birini tanlash ");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowlist = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Edit");
        button.setCallbackData("editId");
        row.add(button);
        rowlist.add(row);

        inlineKeyboardMarkup.setKeyboard(rowlist);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
}
