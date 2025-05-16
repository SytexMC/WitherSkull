package me.sytex.witherSkull.listeners;

import org.bukkit.Material;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;


public class EntityDeathListener implements Listener {

  @EventHandler
  public void onEntityDeath(@NotNull EntityDeathEvent event) {
    if (!(event.getEntity() instanceof WitherSkeleton)) return;

    event.getDrops().add(new ItemStack(Material.WITHER_SKELETON_SKULL));
  }
}
