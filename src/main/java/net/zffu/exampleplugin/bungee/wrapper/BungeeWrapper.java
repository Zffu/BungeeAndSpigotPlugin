package net.zffu.exampleplugin.bungee.wrapper;

import net.md_5.bungee.api.ProxyServer;
import net.zffu.exampleplugin.core.wrapper.AbstractWrapper;

public class BungeeWrapper extends AbstractWrapper {
    @Override
    public void logToConsole(String msg) {
        ProxyServer.getInstance().getConsole().sendMessage(msg);
    }
}
