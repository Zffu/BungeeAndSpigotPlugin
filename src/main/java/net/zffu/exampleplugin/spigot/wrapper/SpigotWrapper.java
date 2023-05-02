package net.zffu.exampleplugin.spigot.wrapper;

import net.zffu.exampleplugin.core.wrapper.AbstractWrapper;
import org.bukkit.Bukkit;

public class SpigotWrapper extends AbstractWrapper {
    @Override
    public void logToConsole(String msg) {
        Bukkit.getConsoleSender().sendMessage(msg);
    }
}
