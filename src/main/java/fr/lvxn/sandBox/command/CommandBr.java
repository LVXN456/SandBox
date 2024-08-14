package fr.lvxn.sandBox.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandBr implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] strings) {
        sender.sendMessage("Bravo tu as executé /br");
    }
}
