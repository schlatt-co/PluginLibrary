package io.github.jroy.pluginlibrary;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;

public class PluginLibrary extends JavaPlugin {

  public static GlowEnchantment glowEnchantment;

  static {
    try {
      Field acceptingNew = Enchantment.class.getDeclaredField("acceptingNew");
      acceptingNew.setAccessible(true);
      acceptingNew.set(null, true);
      glowEnchantment = new GlowEnchantment();
      EnchantmentWrapper.registerEnchantment(glowEnchantment);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void onEnable() {
    getLogger().info("PluginLibrary has been injected into the classpath!");
  }
}
