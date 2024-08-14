package fr.lvxn.sandBox;

import fr.lvxn.sandBox.command.Commandbr;
import org.bukkit.plugin.java.JavaPlugin;

public final class SandBox extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("SandBox Plugin Enabled");
        Commandbr commandExecutor = new Commandbr(this);
        getCommand("br").setExecutor(commandExecutor);
        getCommand("bc").setExecutor(commandExecutor);
        getCommand("rs").setExecutor(commandExecutor);
    }

    @Override
    public void onDisable() {
        System.out.println("SandBox Plugin Disabled");
    }
}
