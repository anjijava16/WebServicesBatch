package com.iwinner.cbcn.ws.exceptions;

/***
 * It is ServiceException custom exception
 * 
 * @author Valuelabs
 * @since 25th Jan,2016
 * @version 1.0
 * 
 */
public class IntegrationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegrationException() {
		super();
	}

	public IntegrationException(String message) {
		super(message);
	}

	public IntegrationException(String message, Throwable cause) {
		super(message, cause);
	}

	public IntegrationException(Throwable cause) {
		super(cause);
	}
}
