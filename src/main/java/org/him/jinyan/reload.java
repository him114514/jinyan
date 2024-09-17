package org.him.jinyan;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class reload implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!commandSender.isOp() && (!(commandSender instanceof ConsoleCommandSender) || !command.equals("jyreload"))){

            commandSender.sendMessage("§c咦~，没实力做什么打肿脸充胖子的事");
            return false;


        }else{
            JinYan.thejinyan.reloadConfig();
            commandSender.sendMessage("§2[him]:成功重载插件");
            return true;

        }
    }
}
