package me.guwooing.guiface;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {

    private Main plugin;

    public Command(Main plugin) {
        this.plugin = plugin;

        plugin.getCommand("test").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }

        Player p = (Player) sender;

        if (p.hasPermission("blah blah")) {
         //UI.openInventory(UI.GUI(p));
        }
        return false;
    }
}
