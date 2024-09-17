package org.him.jinyan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class help implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("jyhelp")) {
            commandSender.sendMessage("§6him的插件帮助:");
            commandSender.sendMessage("§e/jyhelp 此插件的帮助");
            commandSender.sendMessage("§e/jinyan <玩家> 禁言指定的玩家");
            commandSender.sendMessage("§e/jiechu <玩家> 解除指定玩家的禁言");
            commandSender.sendMessage("§e/jinyanall 禁言所有玩家");
            commandSender.sendMessage("§e/jiechuall 解除所有玩家的禁言");
            commandSender.sendMessage("§e/jyreload 重载此插件");
            return true;
        }
        return false;
    }


}


