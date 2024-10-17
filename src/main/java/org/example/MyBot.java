package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageMedia;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class MyBot extends TelegramLongPollingBot {
    private MyBotService myBotService = new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            EditMessageText editMessageText = new EditMessageText();
            editMessageText.setChatId(chatId);









            if (text.equals("/start")) {

                try {
                    execute(myBotService.sendMessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (text.equals("/photo")) {

                try {
                    execute(myBotService.sendPhoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            } else if (text.equals("/dice")) {
                try {
                    execute(myBotService.sendDice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
//            } else if (text.equals("/stic")) {
//                try {
////                    execute(myBotService.sendSticker(chatId));
////                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
            } else if (text.equals("/button")) {
                try {
                    execute(myBotService.replayButton(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (text.equals("/button1")) {
                try {
                    execute(myBotService.inlineButton(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("/startt")) {
                try {
                    execute(myBotService.replyButton(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("menu")) {
                try {
                    execute(myBotService.inlineKeybordd(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (text.equals("SignUp")) {
                try {
                    execute(myBotService.inlineKeybordd(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();

            Long chatId = callbackQuery.getMessage().getChatId();
            if (data.equals("inlineId")) {
                try {
                    execute(myBotService.sendMessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("change")) {
                EditMessageMedia editMessageText = new EditMessageMedia();
                editMessageText.setChatId(chatId);
                editMessageText.setMedia(new InputMediaPhoto("https://images.app.goo.gl/QMy7emzks1oJmRRA9"));
                editMessageText.setMessageId(callbackQuery.getMessage().getMessageId());

                try {
                    execute(editMessageText);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (data.equals("ism")) {
                try {
                    execute(myBotService.enterName(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("Phone")) {
                try {
                    execute(myBotService.enterPhoneNumber(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else if (data.equals("location")) {
                try {
                    execute(myBotService.enterLocation(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        }

    }

    @Override
    public String getBotUsername() {
        return "mxmdjnvbot";
    }

    @Override
    public String getBotToken() {
        return "7365507653:AAFEPi4-31qn4nmVo7pxkjJ2ZE2IeOjjRzo";
    }
}
