package org.hibernate.forge.addon.connections;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ConnectionProfileManagerProviderImpl implements
		ConnectionProfileManagerProvider {
	
	@Inject
	private ConnectionProfileManager defaultManager;
	
	private ConnectionProfileManager connectionProfileManager;

	@Override
	public void setConnectionProfileManager(ConnectionProfileManager manager) {
		this.connectionProfileManager = manager;
	}

	@Override
	public ConnectionProfileManager getConnectionProfileManager() {
		if (connectionProfileManager != null) {
			return connectionProfileManager;
		} else {
			return defaultManager;
		}
	}

}
