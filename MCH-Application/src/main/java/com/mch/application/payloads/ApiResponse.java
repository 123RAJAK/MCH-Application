package com.mch.application.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ApiResponse {
	
public String message;
public boolean success;


public ApiResponse(String message, boolean success) {
	super();
	this.message = message;
	this.success = success;
}

public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public boolean isSuccess() {
	return success;
}
public void setSuccess(boolean success) {
	this.success = success;
}

@Override
public String toString() {
	return "ApiResponse [message=" + message + ", success=" + success + "]";
}




	
}
