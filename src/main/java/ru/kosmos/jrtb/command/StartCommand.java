package ru.kosmos.jrtb.command;

import org.telegram.telegrambots.meta.api.objects.Update;
import ru.kosmos.jrtb.repository.entity.TelegramUser;
import ru.kosmos.jrtb.service.SendBotMessageService;
import ru.kosmos.jrtb.service.TelegramUserService;

/**
 * Start {@link Command}.
 */
public class StartCommand implements Command {

    private final SendBotMessageService sendBotMessageService;
    private final TelegramUserService telegramUserService;

    public final static String START_MESSAGE = "Привет. Я Javarush Telegram Bot.\n " +
            "Я помогу тебе быть в курсе последних статей тех авторов, которые тебе интересны.\n\n" +
            "Нажимай /addGroupSub чтобы подписаться на группу статей в JavaRush.\n" +
            "Не знаешь о чем я? Напиши /help, чтобы узнать что я умею.";

    public StartCommand(SendBotMessageService sendBotMessageService, TelegramUserService telegramUserService) {
        this.sendBotMessageService = sendBotMessageService;
        this.telegramUserService = telegramUserService;
    }

    @Override
    public void execute(Update update) {
        String chatId = update.getMessage().getChatId().toString();

        telegramUserService.findByChatId(chatId).ifPresentOrElse(
                user -> {
                    user.setActive(true);
                    telegramUserService.save(user);
                },
                () -> {
                    TelegramUser telegramUser = new TelegramUser();
                    telegramUser.setActive(true);
                    telegramUser.setChatId(chatId);
                    telegramUserService.save(telegramUser);
                });

        sendBotMessageService.sendMessage(chatId, START_MESSAGE);
    }

}