package com.iwinner.cbcn.ws.exceptions;


/***
 * It is ServiceException custom exception
 * 
 * @author anjaiahspr
 * @since 25th Jan,2016
 * @version 1.0
 * 
 */

public class DaoException extends Exception {

	private static final long serialVersionUID = 1L;

	public DaoException() {
		super();
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DaoException(Throwable cause) {
		super(cause);
	}

}
