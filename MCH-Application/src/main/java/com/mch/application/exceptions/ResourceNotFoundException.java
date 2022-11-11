package com.mch.application.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	String resourceName;
	String fieldName;
	String fieldValue;
	
	public ResourceNotFoundException(String resourceName,String fieldName,String fieldValue){
		super(String.format("%s not found with %s : %s",resourceName,fieldName,fieldValue));		
	}
	

}
