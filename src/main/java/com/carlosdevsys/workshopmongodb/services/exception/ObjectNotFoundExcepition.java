package com.carlosdevsys.workshopmongodb.services.exception;

public class ObjectNotFoundExcepition extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	
	//constructor
	public ObjectNotFoundExcepition(String msg) {
		
		super(msg);
		
	}

}
