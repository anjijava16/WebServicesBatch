package com.iwinner.ws.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoingWSServiceIF extends Remote {

	public boolean loginVerfication(String username, String password)
			throws RemoteException;
	
}
