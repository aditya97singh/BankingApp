package com.capgemini.beans;

public class InvalidAccountnumberException extends Throwable{

	public InvalidAccountnumberException()
	{
		
	}
	public InvalidAccountnumberException(String msg)
	{
		super(msg);
	}
}
