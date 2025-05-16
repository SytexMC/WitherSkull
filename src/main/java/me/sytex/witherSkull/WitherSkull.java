package me.sytex.witherSkull;

import me.sytex.witherSkull.listeners.EntityDeathListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WitherSkull extends JavaPlugin {

  @Override
  public void onEnable() {
    Bukkit.getPluginManager().registerEvents(new EntityDeathListener(), this);
  }
}