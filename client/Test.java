package com.cjc.bms.client;
import java.util.*;

import com.cjc.bms.serviceimp.Sbi;
public class Test {
	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
		 Sbi s=new Sbi();
		 
		 System.out.println("**--------ENTER YOUR CHOICE--------**");
		 System.out.println	("**CREATE ACCOUNT** ");
		 System.out.println	("**DISPLAY DETAILS** ");
		 System.out.println	("**DISOPIT MONEY** ");
		 System.out.println	("**WIDRAWL AMMOUNT** ");
		 System.out.println ("**CHECK BALANCE** ");
		 int choice =sc.nextInt();
		 
		 if(choice==1) {
			 s.Createaccount();
		 }
		 else if(choice==2) {
			 s.DisplayAccountDetails();
			 
		 }
		 else if(choice==3) {
			 s.DepositeMoney();
		 }
		 else if(choice==4) {
			 s.WidrawlMoney();
		 }
		 else if (choice==5) {
			 s.CheckBalance();
		 }
		 else if (choice==6) {
			 System.out.println("THANKYOU FOR USING SBI BANK  GOODBYE");
			 
		 }
		 else {
			 System.out.println("ENTER YOUR CHOICE PROPERLY");
		 }
	}
}


