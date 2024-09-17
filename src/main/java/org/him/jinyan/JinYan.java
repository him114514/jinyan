package org.him.jinyan;


import org.bukkit.plugin.java.JavaPlugin;



public final class JinYan extends JavaPlugin{

    public static JinYan thejinyan;

    public static boolean an;

    @Override
    public void onEnable() {
        // Plugin startup logic


        JinYan.thejinyan = this;
        JinYan.an = this.getConfig().getBoolean("JYALL");


        getLogger().info("-----------------------------------------" +
                "him系列插件加载中" +
                "-----------------------------------------");
        System.err.println("你们这些玩我的世界的废物畜生滚去吃屎吧，臭傻逼！");
        getLogger().info("§3王诚睿电话号码18159837784");
        getLogger().info("-----------------------------------------" +
                "操你妈" +
                "-----------------------------------------");

        getCommand("jinyanall").setExecutor(new jyall());
        getCommand("jiechuall").setExecutor(new jcjyall());
        getCommand("jyreload").setExecutor(new reload());
        getCommand("jyhelp").setExecutor(new help());


        getServer().getPluginManager().registerEvents(new sj(), this);

        saveDefaultConfig();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getLogger().info("-----------------------------------------" +
                "him系列插件卸载中" +
                "-----------------------------------------");
        System.err.println("粑粑猪，及其粉丝群体，好死！");
        System.err.println("今天我把话撂这，你们粑粑猪就是个喜欢被操的臭婊子！");
        getLogger().info("-----------------------------------------" +
                "操你妈" +
                "-----------------------------------------");

    }
}

