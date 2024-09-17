package org.him.jinyan;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class sj implements Listener {

    @EventHandler
    public void onPlayerChat(PlayerChatEvent event) {

        if (JinYan.an) {

            event.setCancelled(true);
            event.getPlayer().sendMessage("§c全体禁言ing");
        }else{
            event.setCancelled(false);

        }

    }

}
