package me.guwooing.guiface;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new Command(this);
        new InventoryClickListener(this);
        UI.initialize();
    }
}
