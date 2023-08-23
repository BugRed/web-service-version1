package com.exampleweb.demo.services.exceptios;

public class ResourceNotFoundExceptions extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExceptions (Object id) {
		super("Reource not found. Id " + id);
	}
	
	
}
