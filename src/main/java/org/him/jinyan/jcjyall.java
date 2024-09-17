package org.him.jinyan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class jcjyall implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // 权限检查
        if (!(sender.isOp() || sender instanceof ConsoleCommandSender) || !command.getName().equalsIgnoreCase("jiechuall")) {
            sender.sendMessage("§c咦~，没实力做什么打肿脸充胖子的事");
            return false;
        }

        // 解除禁言
        JinYan.thejinyan.getConfig().set("JYALL", false);
        JinYan.thejinyan.getConfig().set("nochatplayer", JinYan.noChatPlayers);
        JinYan.thejinyan.saveConfig();
        JinYan.an = JinYan.thejinyan.getConfig().getBoolean("JYALL");
        sender.sendMessage("§2成功解除所有玩家禁言");
        return true;
    }
}
