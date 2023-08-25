package com.exampleweb.demo.services.exceptios;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException (Object id) {
		super("Reource not found. Id " + id);
	}
	
	
}
