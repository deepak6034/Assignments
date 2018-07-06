package com.capg.lab6;

public class NotNullException extends Exception{
	
	private String msg;

	public NotNullException(String msg)
	{
		this.msg = msg;
	}

	@Override
	public String toString() {
		
		return msg;
	}

}
