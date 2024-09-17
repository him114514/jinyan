package org.him.jinyan;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;


public class sj2 implements Listener {
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        boolean ja = JinYan.an;

        if (ja) {

            event.setCancelled(true);
            event.getPlayer().sendMessage("§c全体禁言ing");
        }else{
            event.setCancelled(false);

        }
    }
}
