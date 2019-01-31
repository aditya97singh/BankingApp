package com.capgemini.beans;

public class InsufficientOpeningAmount extends Exception{

	public InsufficientOpeningAmount()
	{
		
	}
	public InsufficientOpeningAmount(String msg)
	{
		super(msg);
	}
}
