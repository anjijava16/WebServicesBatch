package com.iwinner.ws.jdbc.dao;

import com.iwinner.ws.service.UserInfoDTO;

public interface ProcessDaoIF {

	public boolean loginVerifaction(String username, String password);

	public UserInfoDTO getUserDetails(String username);

}
