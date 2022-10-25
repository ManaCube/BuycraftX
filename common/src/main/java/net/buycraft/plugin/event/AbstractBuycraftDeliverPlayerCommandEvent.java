package net.buycraft.plugin.event;

import net.buycraft.plugin.execution.strategy.ToRunQueuedCommand;

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

}

