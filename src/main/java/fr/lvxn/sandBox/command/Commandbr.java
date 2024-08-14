package fr.lvxn.sandBox.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Commandbr implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("br")) {
                p.sendMessage("§eBravo tu as executé /br");
                return true;
            }
            if (cmd.getName().equalsIgnoreCase("bc")) {
                if (args.length == 0) {
                    p.sendMessage("§4La command est : /bc <message>");
                }
                if (args.length >= 1) {
                    StringBuilder bc = new StringBuilder();
                    for (String s : args) {
                        bc.append(s + " ");
                    }
                    Bukkit.broadcastMessage("§e[ §4Alerte §e] "+ChatColor.RED+bc.toString());
                }
                return true;
            }
            if (cmd.getName().equalsIgnoreCase("rs")) {
                startTimer();
                return true;
            }
        }
        return false;
    }
    public void startTimer() {
        int[] timeListed = {60,30,15,10,5,4,3,2,1};
        for (int time : timeListed){
            Bukkit.getScheduler().runTaskLater((Plugin)this, () -> Bukkit.broadcastMessage("§e[ §4Alerte §e] §cLe serveur va Restart dans " + time + " seconds "),(60 - time)*20L);
        }
        Bukkit.getScheduler().runTaskLater((Plugin)this, () -> Bukkit.broadcastMessage("§e[ §4Alerte §e] §cLe serveur Restart"), 60*20L);
    }
}
