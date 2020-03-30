package me.guwooing.guiface;

import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    //start up logic
    @Override
    public void onEnable() {
        new InventoryClickListener(this);
        UI.initialize();
        this.getCommand("staff").setExecutor(new Commands(this));
    }
}
