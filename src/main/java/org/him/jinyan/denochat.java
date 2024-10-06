package org.him.jinyan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;


public class denochat implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender.isOp() || sender instanceof ConsoleCommandSender) || !command.getName().equalsIgnoreCase("jiechu")) {
            sender.sendMessage("§c咦~，没实力做什么打肿脸充胖子的事");
            return false;
        }

        if (args.length == 0) {
            sender.sendMessage("§c语法错误");
            return false;
        }

        String playerName = args[0];
        JinYan.noChatPlayers.remove(playerName);
        JinYan.config.set("nochatplayer", JinYan.noChatPlayers);
        JinYan.thejinyan.saveConfig();
        sender.sendMessage("§2成功解除此玩家的禁言");
        return true;
    }
}
