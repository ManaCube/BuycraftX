package net.buycraft.plugin.bukkit.event;

import java.util.UUID;
import net.buycraft.plugin.event.AbstractBuycraftDeliverPlayerCommandEvent;
import net.buycraft.plugin.execution.strategy.ToRunQueuedCommand;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.Nullable;

/**
 * @author AlexMl Created on 25.10.22 for BuycraftX
 */
public class BuycraftDeliverPlayerCommandEvent extends Event
{

	private static final HandlerList HANDLERS = new HandlerList();

	private final AbstractBuycraftDeliverPlayerCommandEvent event;

	BuycraftDeliverPlayerCommandEvent(AbstractBuycraftDeliverPlayerCommandEvent event)
	{
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

	public String getPlayerName()
	{
		return event.getPlayerName();
	}

	@Nullable
	public UUID getPlayerUUID()
	{
		return event.getPlayerUUID();
	}

	@Nullable
	public Player getPlayer()
	{
		UUID uuid = getPlayerUUID();
		if (uuid != null)
		{
			return Bukkit.getPlayer(uuid);
		} else
		{
			return Bukkit.getPlayerExact(getPlayerName());
		}
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
