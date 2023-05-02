package net.zffu.exampleplugin.core;


import lombok.Getter;
import net.zffu.exampleplugin.core.wrapper.AbstractWrapper;
import net.zffu.exampleplugin.utils.VersionUtils;

@Getter
public class ExamplePlugin {

    // Core Instance Always useful for something
    private static ExamplePlugin INSTANCE;

    // Allows you to make actions both in spigot and bungee
    private AbstractWrapper wrapper;

    public ExamplePlugin() {
        INSTANCE = this;

        if(VersionUtils.isBukkit()) {
            // If the Server is running bukkit, use a spigot wrapper
            wrapper = new net.zffu.exampleplugin.spigot.wrapper.SpigotWrapper();
        }
        else {
            // If Not, use a bungee wrapper
            wrapper = new net.zffu.exampleplugin.bungee.wrapper.BungeeWrapper();
        }

        // Sending a message to the console
        wrapper.logToConsole("Example");

    }


    public static ExamplePlugin getInstance() {return INSTANCE;}

}
