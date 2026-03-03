package com.first.example;
import java.util.Scanner;

public class ShoppingDiscount {

	
	public static void main( String[] args) {
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter your amount=");
	double amount=sc.nextDouble();
	double finalamount;
	double discount;
	
	if (amount>1000 && amount<3000) {
		
		finalamount=amount-(amount*0.1);
	}
	else if( amount>3000 && amount<5000) {
		finalamount=amount-(amount*0.15);
		
	}
	else {
		finalamount=amount-(amount*0.2);
	}
	
	discount=amount-finalamount;
	
		System.out.println("your total bill= " +finalamount);
		System.out.println("your total savings= " +discount);
		
		
	}
	
	
}
