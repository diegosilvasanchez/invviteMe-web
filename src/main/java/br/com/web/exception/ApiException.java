package br.com.web.exception;

public class ApiException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8715507018731726612L;

	public ApiException(String error){
		super(error);
	}
}
