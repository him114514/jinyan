package org.him.jinyan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class help implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("jyhelp")) {
            commandSender.sendMessage("him的插件帮助:");
            commandSender.sendMessage("/jyhelp 此插件的帮助");
            commandSender.sendMessage("/jinyanall 禁言所有玩家");
            commandSender.sendMessage("/jiechuall 解除所有玩家的禁言");
            commandSender.sendMessage("/jyreload 重载此插件");
            return true;
        }
        return false;
    }


}


