package org.him.jinyan;


import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;


public final class JinYan extends JavaPlugin{

    public static JinYan thejinyan;
    public static List<String> noChatPlayers;

    public static FileConfiguration config;
    public static boolean an;

    @Override
    public void onEnable() {
        // Plugin startup logic


        JinYan.thejinyan = this;
        config = this.getConfig();
        JinYan.an = config.getBoolean("JYALL",true);
        JinYan.noChatPlayers = config.getStringList("nochatplayer");

        System.out.println("\n"
                           +" _    _ _____ __  __ \n" +
                            "| |  | |_   _|  \\/  |\n" +
                            "| |__| | | | | \\  / |\n" +
                            "|  __  | | | | |\\/| |\n" +
                            "| |  | |_| |_| |  | |\n" +
                            "|_|  |_|_____|_|  |_|");
        System.out.println("§2作者him的QQ:715387640");
        System.out.println("§c§l群号：139865381");

        getLogger().info("§e------------------------------------------------------------------" +
                "§ehim系列插件加载中" +
                "§e------------------------------------------------------------------");
        System.out.println("§c§l实名上网赵梁树");
        System.out.println("§aB站：Technology_him");
        System.out.println("§2§lweixin：wxid_7xwte2bel3k022");
        getLogger().info("§d猪神Technoblade是§6狗屎");
        System.err.println("你们这些玩我的世界的废物畜生滚去吃屎吧，臭傻逼！");
        getLogger().info("§3王诚睿电话号码18159837784");
        getLogger().info("§3------------------------------------------------------------------" +
                "§3操你妈" +
                "§3------------------------------------------------------------------");

        getCommand("jinyanall").setExecutor(new jyall());
        getCommand("jiechuall").setExecutor(new jcjyall());
        getCommand("jyreload").setExecutor(new reload());
        getCommand("jyhelp").setExecutor(new help());
        getCommand("jinyan").setExecutor(new nochat());
        getCommand("jiechu").setExecutor(new denochat());
        getServer().getPluginManager().registerEvents(new sj(), this);

        config.options().copyDefaults(true);
        saveDefaultConfig();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("\n"
                +" _    _ _____ __  __ \n" +
                "| |  | |_   _|  \\/  |\n" +
                "| |__| | | | | \\  / |\n" +
                "|  __  | | | | |\\/| |\n" +
                "| |  | |_| |_| |  | |\n" +
                "|_|  |_|_____|_|  |_|");
        System.out.println("§2作者him的QQ:715387640");
        System.out.println("§c§l群号：139865381");

        getLogger().info("§e------------------------------------------------------------------" +
                "§ehim系列插件卸载中" +
                "§e------------------------------------------------------------------");
        System.out.println("§c§l实名上网赵梁树");
        System.out.println("§aB站：Technology_him");
        System.out.println("§2§lweixin：wxid_7xwte2bel3k022");
        getLogger().info("§d猪神Technoblade是§6狗屎");
        System.err.println("粑粑猪，及其粉丝群体，好死！");
        System.err.println("今天我把话撂这，你们粑粑猪就是个喜欢被操的臭婊子！");
        getLogger().info("§3------------------------------------------------------------------" +
                "§3操你妈" +
                "§3------------------------------------------------------------------");

    }
}

