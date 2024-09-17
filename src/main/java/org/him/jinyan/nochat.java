package org.him.jinyan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class nochat implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        if (!(sender instanceof ConsoleCommandSender) && !sender.isOp()) {
            sender.sendMessage("§c咦~，没实力做什么打肿脸充胖子的事");
            return false;
        }

        if (!command.getName().equalsIgnoreCase("jinyan")) {
            return false;
        }

        if (args.length == 0) {
            sender.sendMessage("§c语法错误");
            return false;
        }

        String playerName = args[0];
        JinYan.noChatPlayers.add(playerName);

        JinYan.thejinyan.getConfig().set("nochatplayer", JinYan.noChatPlayers);
        JinYan.thejinyan.saveConfig();

        sender.sendMessage("§2玩家 " + playerName + " 已成功被禁言");
        return true;
    }
}
