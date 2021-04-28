package me.superorca.thebestplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class TheBestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.shutdown();
    }
}
