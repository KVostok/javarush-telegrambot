package ru.kosmos.jrtb.command;

import org.telegram.telegrambots.meta.api.objects.Update;
import ru.kosmos.jrtb.service.SendBotMessageService;

import static java.lang.String.format;
import static ru.kosmos.jrtb.command.CommandName.STAT;

/**
 * Admin Help {@link Command}.
 */
public class AdminHelpCommand implements Command {

    public static final String ADMIN_HELP_MESSAGE = format("✨<b>Доступные команды админа</b>✨\n\n"
                    + "<b>Получить статистику</b>\n"
                    + "%s - статистика бота\n",
            STAT.getCommandName());

    private final SendBotMessageService sendBotMessageService;

    public AdminHelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), ADMIN_HELP_MESSAGE);
    }

}