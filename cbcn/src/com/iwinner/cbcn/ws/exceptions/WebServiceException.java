package com.iwinner.cbcn.ws.exceptions;

/***
 * It is ServiceException custom exception
 * 
 * @author anjaiahspr
 * @since 25th Jan,2016
 * @version 1.0
 * 
 */
public class WebServiceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WebServiceException() {
		super();
	}

	public WebServiceException(String message) {
		super(message);
	}

	public WebServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public WebServiceException(Throwable cause) {
		super(cause);
	}
}
