package ru.kosmos.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static ru.kosmos.jrtb.command.AdminHelpCommand.ADMIN_HELP_MESSAGE;
import static ru.kosmos.jrtb.command.CommandName.ADMIN_HELP;

@DisplayName("Unit-level testing for AdminHelpCommand")
public class AdminHelpCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return ADMIN_HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return ADMIN_HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new AdminHelpCommand(sendBotMessageService);
    }

}