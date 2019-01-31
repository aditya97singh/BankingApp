package com.capgemini.bl;
import com.capgemini.beans.*;
import java.util.LinkedList;

public class Hdfcbank {
	
	LinkedList<Account> l=new LinkedList<>();
	
	public String createaccount(int a,int b)throws InsufficientOpeningAmount
	{
		Account account=new Account(a,b);
			if(b>=500)
			{
				l.add(account);
			    return "Created Successfully";
			}
		throw new InsufficientOpeningAmount("Insufficient Opening Amount");
	}
	
	public int withdrawamount(int a,int b) throws InsufficientAmountException
	{
		for(Account account:l)
		{
			if(account.getAccountnum()==a && account.getAmount()-b>0)
			{
				account.setAmount(account.getAmount()-b);
				return account.getAmount();
			}
		}
		throw new InsufficientAmountException("Insufficient Amount");
	}
	public int deposit(int aa,int bb) throws InvalidAccountnumberException
	{
		for(Account account:l)
		{
			if(account.getAccountnum()==aa)
			{
				account.setAmount(account.getAmount()+bb);
				return account.getAmount();
			}
		}
		throw new InvalidAccountnumberException("Invalid Account");
	}

	/*public Account search(int a) throws InvalidAccountnumberException
	{
		for(Account account:l)
		{
			if(account.getAccountnum()==a)
				return account;
      	}
		throw new InvalidAccountnumberException("Invalid Account");
	}
	
	public String fundtransfer(int a,int b,int m) throws InsufficientAmountException, InvalidAccountnumberException
	{
		Account x=search(a);
		Account y=search(b);
		if(y.getAmount()-m>0)
		{
		 x.setAmount(x.getAmount()+m);
		 return (""+x.getAmount());
		}
		throw new InsufficientAmountException("Insufficient Amount");	
	}*/
}

