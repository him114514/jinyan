package org.him.jinyan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;


public class jcjyall implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        if (!(sender.isOp() || sender instanceof ConsoleCommandSender) || !command.getName().equalsIgnoreCase("jiechuall")) {
            sender.sendMessage("§c咦~，没实力做什么打肿脸充胖子的事");
            return false;
        }
        JinYan.config.set("JYALL", false);
        JinYan.an = JinYan.config.getBoolean("JYALL");
        JinYan.thejinyan.saveConfig();

        sender.sendMessage("§2成功解除所有玩家禁言");
        return true;
    }
}
