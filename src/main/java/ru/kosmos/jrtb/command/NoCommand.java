package ru.kosmos.jrtb.command;

import org.telegram.telegrambots.meta.api.objects.Update;
import ru.kosmos.jrtb.service.SendBotMessageService;

import static ru.kosmos.jrtb.command.CommandUtils.getChatId;

/**
 * No {@link Command}.
 */
public class NoCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String NO_MESSAGE = "Я поддерживаю команды, начинающиеся со слеша(/).\n"
            + "Чтобы посмотреть список команд введи /help";

    public NoCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(getChatId(update), NO_MESSAGE);
    }

}