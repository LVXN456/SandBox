package fr.lvxn.sandBox.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandbr implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("br")) {
                p.sendMessage("§eBravo tu as executé /br");
                return true;
            }
            if (cmd.getName().equalsIgnoreCase("bc")) {
                if (arg.length == 0) {
                    p.sendMessage("§4La command est : /bc <message>");
                }
                if (arg.length >= 1) {
                    StringBuilder bc = new StringBuilder();
                    for (String s : arg) {
                        bc.append(s + " ");
                    }
                    Bukkit.broadcastMessage("§e[ §4Alerte §e] "+ChatColor.RED+bc.toString());
                }
                return true;
            }
        }
        return false;
    }
}
