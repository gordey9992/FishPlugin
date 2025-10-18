package com.yourname.fishplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public class FishPlugin extends JavaPlugin implements CommandExecutor {
    
    @Override
    public void onEnable() {
        getCommand("fish").setExecutor(this);
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.getInventory().addItem(new ItemStack(Material.COD, 1));
            player.sendMessage("§bТы получил волшебную рыбу!");
            return true;
        }
        return false;
    }
}
