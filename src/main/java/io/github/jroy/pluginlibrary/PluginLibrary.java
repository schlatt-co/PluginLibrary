package io.github.jroy.pluginlibrary;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginLibrary extends JavaPlugin {

  @Override
  public void onEnable() {
    getLogger().info("PluginLibrary has been injected into the classpath!");
  }
}
