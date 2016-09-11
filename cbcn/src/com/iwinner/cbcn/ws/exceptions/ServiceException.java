package com.iwinner.cbcn.ws.exceptions;

/***
 * It is ServiceException custom exception
 * 
 * @author anjaiahspr
 * @since 25th Jan,2016
 * @version 1.0
 * 
 */
public class ServiceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}
}
