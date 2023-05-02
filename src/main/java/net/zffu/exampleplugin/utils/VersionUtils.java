package net.zffu.exampleplugin.utils;

public class VersionUtils {

    public static boolean isBukkit() {
        try {
            if(Class.forName("org.bukkit.Bukkit") != null) {
                return true;
            }
        } catch (ClassNotFoundException e) {}
        return false;
    }

}
