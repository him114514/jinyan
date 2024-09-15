package org.him.jinyan;

import org.bukkit.Color;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class sj implements Listener {

    @EventHandler
    public void onPlayerChat(PlayerChatEvent event) {
        if (JinYan.an) {

            event.setCancelled(true);
            event.getPlayer().sendMessage(Color.RED+"全体禁言ing");
        }else{
            event.setCancelled(false);
            event.getPlayer().sendMessage(Color.GREEN+"已解除禁言");
        }
    }

}
