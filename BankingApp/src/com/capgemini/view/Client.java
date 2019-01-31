package com.capgemini.view;
import com.capgemini.beans.*;
import com.capgemini.bl.*;
public class Client {

	public static void main(String[] args) {
		Hdfcbank b=new Hdfcbank();
		try
		{
		 System.out.println(b.createaccount(101,2000));
		 System.out.println(b.createaccount(102,2000));
		 System.out.println("Remaining Amount : "+b.withdrawamount(101, 1000));
		 System.out.println("Remaining Amount : "+b.withdrawamount(102, 3000));
		 System.out.println("Amount updated : "+b.deposit(101,222));
		// System.out.println("Amount transfered : "+b.fundtransfer(101,102,222));
		}catch(InsufficientOpeningAmount e)
		{
			System.out.println(e.getMessage());
		}
		catch(InsufficientAmountException e)
		{
		  System.out.println(e.getMessage());	
		}
        catch(InvalidAccountnumberException e)
		{
			System.out.println(e.getMessage());
		}

		}

}
