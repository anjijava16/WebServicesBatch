package com.iwinner.ws.service;

import java.rmi.RemoteException;

public class LoingWSServiceImpl implements LoingWSServiceIF {

	public boolean loginVerfication(String username, String password)
			throws RemoteException {
	
		// Write the bunisess Logic Here

				if (username != null && password != null) {

					if (username.equalsIgnoreCase("java")&& password.equalsIgnoreCase("java")) {
						return true;
					} else {
						return false;
					}
				} else {

					return false;
				}
			}
	}


