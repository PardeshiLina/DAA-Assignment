package com.first.example;
import java.util.Scanner;
public class Atm_practice {
	
	public static void main(String[] args) {
		int i=0;
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your pin");
			int upin=sc.nextInt();
			int mpin=1234;
			double balance= 146654;
		
		
		if(upin==mpin) {
			while(true) {
			System.out.println("1.For Display Balance\n"
					+ "2.For withdraw money\n"
					+ "3.For deposit money\n"
					+ "4.Exit\n");
			int res=sc.nextInt();
			
			
		
		
		if(res==1) {
			System.out.println("balance: " +balance);
			System.out.println("Thanks for visiting us.....!\n");
		}
		else if(res==2) {
			System.out.println("enter amount to withdraw:");
			int withd=sc.nextInt();
			balance=balance-withd;
			
		}
		else if(res==3) {
			System.out.println("enter amount to deposite:");
			int depo=sc.nextInt();
			balance=balance+depo;
			
		}
		else if(res==4) {
			break;
		}
//		if(res!=4) {
//			System.out.println("wrong choice");
//		}
//		
	}
		}
		else {
	      System.out.println("wrong password");
		}
			i++;
		

		} while(i!=4);
		
	}

}
