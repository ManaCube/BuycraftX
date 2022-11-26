package net.buycraft.plugin.event;

import java.util.UUID;
import net.buycraft.plugin.UuidUtil;
import net.buycraft.plugin.execution.strategy.ToRunQueuedCommand;
import org.jetbrains.annotations.Nullable;

/**
 * @author AlexMl Created on 25.10.22 for BuycraftX
 */
public class AbstractBuycraftDeliverPlayerCommandEvent extends AbstractEvent {

	private final String             command;
	private final ToRunQueuedCommand queuedCommand;

	public AbstractBuycraftDeliverPlayerCommandEvent(String command, ToRunQueuedCommand queuedCommand) {
		this.command = command;
		this.queuedCommand = queuedCommand;
	}

	public ToRunQueuedCommand getQueuedCommand() {
		return this.queuedCommand;
	}

	public String getCommand() {
		return this.command;
	}

	public String getPlayerName() {
		return this.queuedCommand.getPlayer().getName();
	}

	@Nullable
	public UUID getPlayerUUID() {
		if (queuedCommand.getPlayer().getUuid() != null) {
			return UuidUtil.mojangUuidToJavaUuid(queuedCommand.getPlayer().getUuid());
		}
		return null;
	}

}

