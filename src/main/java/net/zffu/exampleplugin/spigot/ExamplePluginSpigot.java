package net.zffu.exampleplugin.spigot;

import net.zffu.exampleplugin.core.ExamplePlugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePluginSpigot extends JavaPlugin {

    @Override
    public void onEnable() {
        // Initialize the plugin core
        new ExamplePlugin();
    }

    @Override
    public void onDisable() {

    }
}
