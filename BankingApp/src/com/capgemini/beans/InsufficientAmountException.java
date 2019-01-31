package com.capgemini.beans;
import com.capgemini.bl.*;

public class InsufficientAmountException extends Throwable {

	public InsufficientAmountException(){
		
	}
    public InsufficientAmountException(String msg){
		super(msg);
	}
	
}
