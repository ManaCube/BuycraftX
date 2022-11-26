package net.buycraft.plugin.bukkit.event;

import net.buycraft.plugin.bukkit.BukkitBuycraftPlatformBase;
import net.buycraft.plugin.event.AbstractBuycraftDeliverPlayerCommandEvent;
import net.buycraft.plugin.event.AbstractEvent;
import org.bukkit.event.Event;

/**
 * @author AlexMl Created on 25.10.22 for BuycraftX
 */
public class EventWrapper
{

	public static Event wrapEvent(BukkitBuycraftPlatformBase base, AbstractEvent event) {
		if (event instanceof AbstractBuycraftDeliverPlayerCommandEvent) {
			return new BuycraftDeliverPlayerCommandEvent((AbstractBuycraftDeliverPlayerCommandEvent) event);
		}
		return null;
	}

}
