package de.kumpelblase2.remoteentities.api.events;

import de.kumpelblase2.remoteentities.api.RemoteEntity;

public abstract class RemoteEvent extends BaseEvent
{
	protected final RemoteEntity m_remoteEntity;
	
	public RemoteEvent(RemoteEntity inEntity)
	{
		this.m_remoteEntity = inEntity;
	}
	
	public RemoteEntity getRemoteEntity()
	{
		return this.m_remoteEntity;
	}
}
