package me.guwooing.guiface;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class UI {

    public static Inventory inv;
    public static String inventory_name;
    public static int inv_rows = 4 * 9;

    public static void initialize() {
        inventory_name = Utils.chat("&cTest GUI");

        inv = Bukkit.createInventory(null, inv_rows);
    }

    public static Inventory GUI (Player p) {
        Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);

        Utils.createItem(inv, "COBBLESTONE", 1, -1, "Test Item", "&7This is a lore line", "&bSecond line");

        toReturn.setContents(inv.getContents());
        return toReturn;
    }

    public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&cTest Item"))) {
            p.setDisplayName(Utils.chat("&8[&6*&8] &6You have successfully made a GUI!"));
        }
    }
}
