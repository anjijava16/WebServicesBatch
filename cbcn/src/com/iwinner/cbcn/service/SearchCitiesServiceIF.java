package com.iwinner.cbcn.service;

import java.util.List;

import com.iwinner.cbcn.ws.exceptions.ServiceException;

public interface SearchCitiesServiceIF {

	
	public List searchCitiesNames(String countryName)throws ServiceException;
	
	
	
}
