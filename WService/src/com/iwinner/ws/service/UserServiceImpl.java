package com.iwinner.ws.service;

import java.rmi.RemoteException;

import com.iwinner.ws.jdbc.dao.ProcessDaoIF;
import com.iwinner.ws.jdbc.dao.ProcessDaoImpl;

public class UserServiceImpl implements UserServiceIF {

	public UserInfoDTO getUserInfo(String username) throws RemoteException {

		UserInfoDTO userInfo = null;
		if (username != null) {

			ProcessDaoIF processsDaoIF = new ProcessDaoImpl();

			userInfo = processsDaoIF.getUserDetails(username);
			
			
		} else {
			userInfo = null;
		}
		return userInfo;
	}
	
	// 

}
