package io.github.jroy.pluginlibrary;

import net.md_5.bungee.api.plugin.Plugin;

public class ProxiedPluginLibrary extends Plugin {

  @Override
  public void onEnable() {
    getLogger().info("PluginLibrary has been injected into the classpath!");
  }
}
