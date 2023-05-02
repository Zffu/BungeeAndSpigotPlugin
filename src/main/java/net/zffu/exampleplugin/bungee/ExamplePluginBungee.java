package net.zffu.exampleplugin.bungee;

import net.md_5.bungee.api.plugin.Plugin;
import net.zffu.exampleplugin.core.ExamplePlugin;

public class ExamplePluginBungee extends Plugin {

    @Override
    public void onEnable() {
        // Initialize the plugin core
        new ExamplePlugin();
    }
}
