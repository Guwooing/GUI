package me.guwooing.guiface;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class UI {

    public static Inventory inv;
    public static String inventory_name;
    public static int inv_rows = 4 * 9;

    public static void initialize() {
        inventory_name = Utils.chat("&cGUI Panel");

        inv = Bukkit.createInventory(null, inv_rows);
    }

    public static Inventory GUI (Player p) {
        Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);

        Utils.createItem(inv, Material.STONE, 1, 0, "Test Item", "&7This is a lore line", "&bSecond line");
        Utils.createItem(inv, Material.RED_TERRACOTTA, 1, 2, "Test Item", "&7This is a lore line", "&bSecond line");
        Utils.createItem(inv, Material.ANVIL, 1, 31, "Test Item", "&7This is a lore line", "&bSecond line");
        Utils.createItem(inv, Material.BARRIER, 1, 35, "Exit");

        toReturn.setContents(inv.getContents());
        return toReturn;
    }

    public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv) {
        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&cALL"))) {
            p.setDisplayName(Utils.chat("&8[&6*&8] &6You have successfully made a GUI!"));
        }
    }
}
