package org.him.jinyan;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;


import java.util.List;

public class sj implements Listener {


    @EventHandler
    public void dechatone(PlayerChatEvent ones){
        Player player = ones.getPlayer();
        String p = player.getName();
        List<String> noC = JinYan.noChatPlayers;
        if (noC.contains(p)) {
            ones.setCancelled(true);
            player.sendMessage("§c你已被禁言");
        }

    }

}
