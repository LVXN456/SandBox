package fr.lvxn.sandBox;

import fr.lvxn.sandBox.command.CommandBr;
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

public final class SandBox extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("SandBox Plugin Enabled");
        getCommand("br").setExecutor(new CommandBr());
    }

    @Override
    public void onDisable() {
        System.out.println("SandBox Plugin Disabled");
    }
}
