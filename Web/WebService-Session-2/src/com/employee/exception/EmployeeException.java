package com.employee.exception;

@SuppressWarnings("serial")
public class EmployeeException extends Exception {
	public EmployeeException(String message) {
		super(message);
	}

	public EmployeeException(String message, Throwable cause) {
		super(message, cause);
	}
}
