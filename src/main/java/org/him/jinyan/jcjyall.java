package org.him.jinyan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class jcjyall implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!commandSender.isOp() && (!(commandSender instanceof ConsoleCommandSender) || !command.equals("jiechuall"))){


            commandSender.sendMessage("§c咦~，没实力做什么打肿脸充胖子的事");
            return false;


        }else{
            JinYan.thejinyan.getConfig().set("JYALL",false);
            JinYan.thejinyan.saveConfig();
            JinYan.an = JinYan.thejinyan.getConfig().getBoolean("JYALL");
            commandSender.sendMessage("§2成功解除所有玩家禁言");
            return true;

        }

    }
}
