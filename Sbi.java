package com.cjc.bms.serviceimp;

import java.util.*;

import com.cjc.bms.model.Account;
import com.cjc.bms.servicei.Rbi;

public class Sbi implements Rbi {
	Scanner sc= new Scanner(System.in);
	Account acc=new Account();
	@Override
	public void Createaccount() {
		System.out.println("Enter your acc no");
		long i=sc.nextLong();
		acc.setAccno(i);
		
		System.out.println("Enter your Age");
		int a=sc.nextInt();
		acc.setAge(a);
		
		System.out.println("Enter your Name");
		String s=sc.next();
		acc.setName(s);
		
		System.out.println("Enter your Mobile Number");
		String s1=sc.next();
		acc.setMobno(s1);
		
		System.out.println("Enter your Adhar Number");
		String s2=sc.next();
		acc.setAdharno(s2);
		
		System.out.println("Enter your Gender");
		String s3=sc.next();
		acc.setGender(s3);
		
		System.out.println("Enter your Balance");
		double d=sc.nextDouble();
		acc.setBalance(d);
	}

	@Override
	public void DisplayAccountDetails() 
	
	
	{
//		acc.getAccno();
//		System.out.println("ENTER ACCOUNT NUMBER");
//		long b= sc.nextLong();
//      if (int b = i) {
			System.out.println("Account number:"+ acc.getAccno());
			System.out.println("Account holders name:"+ acc.getName());
			System.out.println("Account holders Adhar number:"+ acc.getAdharno());
			System.out.println("Account holders Mobile number:"+ acc.getMobno());
			System.out.println("Account holders age:"+ acc.getAge());
			System.out.println("Account holders name:"+ acc.getGender());
			System.out.println("Account holders Current balance:"+acc.getBalance());
			
		}
//		else
		{
			System.out.println(" NO ACCOUNT FOUND CREATE YOUR ACCOUNT FIRST");
		}

		
		
			
//		}
	
	@Override
	public void DepositeMoney() 
	
	{
		
		 System.out.println("Enter amount to deposit:");
         double amount = sc.nextDouble();
//         double newBalance = acc.getBalance() + amount; 
         acc.setBalance(acc.getBalance()+ amount); 
         System.out.println("Deposited " + amount + " successfully. New balance: " + acc.getBalance());
	}

	@Override
	public void WidrawlMoney() {
		
		System.out.println("Enter amount to withdraw:");
        double amount = sc.nextDouble();
//        double currentBalance = acc.getBalance();
        acc.setBalance(acc.getBalance() - amount); 
        System.out.println("Withdrew " + amount + " successfully. New balance: " + acc.getBalance());
	}
	
	@Override
	public void CheckBalance() {
		
	System.out.println("Current Balance:"+ acc.getBalance());
		}
		

}
