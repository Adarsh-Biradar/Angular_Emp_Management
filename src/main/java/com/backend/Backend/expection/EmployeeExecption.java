package com.backend.Backend.expection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeExecption extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public EmployeeExecption(String message) {
		super(message);
	}
	
}
