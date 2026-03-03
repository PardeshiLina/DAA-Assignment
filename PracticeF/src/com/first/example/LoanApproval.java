package com.first.example;
import java.util.Scanner;

public class LoanApproval {

	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter your monthly income:");
		int income=sc.nextInt();

		System.out.println("Enter your creditscore:");
		int cs=sc.nextInt();
		
		
	
	
		if (( age>21 && age<60) && income>30000 && cs>700 ) {
			System.out.println("Congrats,Loan is approved...........");
		}
		else {
			System.out.println("Loan not approved!");
		}

		
	}
	
}
