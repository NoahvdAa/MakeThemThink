package me.noahvdaa.makethemthink;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.EntitiesLoadEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MakeThemThink extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onEntitiesLoad(EntitiesLoadEvent event) {
		event.getEntities().forEach(entity -> {
			if (entity instanceof LivingEntity livingEntity) {
				livingEntity.setAI(true);
			}
			if (entity instanceof Mob mob) {
				mob.setAware(true);
			}
		});
	}

}
