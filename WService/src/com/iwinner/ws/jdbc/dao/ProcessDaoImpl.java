package com.iwinner.ws.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.iwinner.ws.jdbc.utils.DbUtils;

public class ProcessDaoImpl implements ProcessDaoIF {

	
	private static Logger LOGGER=Logger.getLogger(ProcessDaoImpl.class);
	
	
	public boolean loginVerifaction(String username, String password) {

		boolean LOGIN_STATUS = Boolean.FALSE;

		// Get the Connection from DbUtils

		try {
			Connection conn = DbUtils.getConnection();
			Statement stmt = conn.createStatement();

			Integer countstatus = 0;
			ResultSet rs = stmt
					.executeQuery("select count(*) from login_ws_tbl as ts where ts.USERNAME='"
							+ username + "' and ts.PASSWORD='" + password + "'");
			while (rs.next()) {
				countstatus = rs.getInt("count(*)");
			}
			if (countstatus != 0) {
				LOGIN_STATUS = Boolean.TRUE;
			} else {
				LOGIN_STATUS = Boolean.FALSE;
			}
		} catch (Exception e) {
			LOGIN_STATUS = Boolean.FALSE;
		}

		return LOGIN_STATUS;
	}

}
