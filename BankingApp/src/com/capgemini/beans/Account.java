package com.capgemini.beans;

public class Account {
	private int accountnum;
	private int amount;
	public Account(int ac,int am)
	{
		super();
		this.accountnum=ac;
		this.amount=am;
	}
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
