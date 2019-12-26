package io.github.jroy.pluginlibrary;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginLibrary extends JavaPlugin {

  @Override
  public void onEnable() {
    Bukkit.getLogger().info("PluginLibrary has been injected into the classpath!");
  }
}
