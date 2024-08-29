package org.him.jinyan;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class jyall implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender.isOp() || commandSender instanceof ConsoleCommandSender
                && command.equals("jinyanall")){

            JinYan.an = true;

            commandSender.sendMessage(Color.GREEN+"成功禁言所有玩家");

            return true;
        }else{
            commandSender.sendMessage(Color.RED+"咦~，没实力做什么打肿脸充胖子的事");
            return false;
        }

    }
}