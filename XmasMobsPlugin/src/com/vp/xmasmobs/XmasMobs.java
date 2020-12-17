package com.vp.xmasmobs;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class XmasMobs extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Listeners(),  this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[XmasMobs]: Enabled!");

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[XmasMobs]: Disabled!");

    }
}
