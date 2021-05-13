package com.devkeni.nodeathscreen;

import com.devkeni.nodeathscreen.listeners.PlayerDeathListener;
import com.devkeni.nodeathscreen.listeners.PlayerJoinListener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NoDeathScreen extends JavaPlugin {

    @Override
    public void onEnable() {
        registerListeners();
    }

    private void registerListeners() {
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(new PlayerJoinListener(), this);
        manager.registerEvents(new PlayerDeathListener(), this);
    }

}