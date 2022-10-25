package net.buycraft.plugin.bukkit.event;

import net.buycraft.plugin.bukkit.BukkitBuycraftPlatformBase;
import net.buycraft.plugin.event.AbstractBuycraftDeliverPlayerCommandEvent;
import net.buycraft.plugin.execution.strategy.ToRunQueuedCommand;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * @author AlexMl Created on 25.10.22 for BuycraftX
 */
public class BuycraftDeliverPlayerCommandEvent extends PlayerEvent
{

	private static final HandlerList HANDLERS = new HandlerList();

	private final AbstractBuycraftDeliverPlayerCommandEvent event;

	BuycraftDeliverPlayerCommandEvent(BukkitBuycraftPlatformBase base, AbstractBuycraftDeliverPlayerCommandEvent event)
	{
		super(base.getPlayer(event.getQueuedCommand().getPlayer()));
		this.event = event;
	}

	public ToRunQueuedCommand getQueuedCommand()
	{
		return event.getQueuedCommand();
	}

	public String getCommand()
	{
		return event.getCommand();
	}

	@Override
	public HandlerList getHandlers()
	{
		return HANDLERS;
	}

	public static HandlerList getHandlerList()
	{
		return HANDLERS;
	}

}
