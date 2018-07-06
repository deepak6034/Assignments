package com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	private String msg;
	public EmployeeException(String msg)
	{
		this.msg = msg;
	}
	@Override
	public String toString() {
		return msg;
	}

}
