package com.iwinner.ws.service;

import java.rmi.RemoteException;

import com.iwinner.ws.jdbc.dao.ProcessDaoIF;
import com.iwinner.ws.jdbc.dao.ProcessDaoImpl;

public class LoingWSServiceImpl implements LoingWSServiceIF {

	public boolean loginVerfication(String username, String password)
			throws RemoteException {

		// Write the bunisess Logic Here

		if (username != null && password != null) {

			ProcessDaoIF processsDaoIF = new ProcessDaoImpl();

			boolean status = processsDaoIF.loginVerifaction(username, password);

			if (status) {
				return true;
			} else {
				return false;
			}

		} else {

			return false;
		}
	}
}
