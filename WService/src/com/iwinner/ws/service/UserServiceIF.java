package com.iwinner.ws.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserServiceIF extends Remote {

	public UserInfoDTO getUserInfo(String username) throws RemoteException;
}
