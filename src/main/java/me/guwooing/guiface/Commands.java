package me.guwooing.guiface;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Commands implements CommandExecutor {

    private Main plugin;

    public Commands(Main plugin) {
        this.plugin = plugin;


    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }

        Player p = (Player) sender;

        if (p.hasPermission("blah blah")) {
            p.openInventory(UI.GUI(p));
        }
        return false;
    }
}
