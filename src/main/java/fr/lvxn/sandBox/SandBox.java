package fr.lvxn.sandBox;

import org.bukkit.plugin.java.JavaPlugin;

public final class SandBox extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("SandBox Plugin Enabled");

    }

    @Override
    public void onDisable() {
        System.out.println("SandBox Plugin Disabled");
    }
}
