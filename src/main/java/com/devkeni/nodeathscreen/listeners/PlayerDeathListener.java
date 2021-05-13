package com.devkeni.nodeathscreen.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        if (event.getEntity() == null) return;
        Player player = event.getEntity().getPlayer();
        if (player.isOnline() && player.isDead()) player.spigot().respawn();
    }

}