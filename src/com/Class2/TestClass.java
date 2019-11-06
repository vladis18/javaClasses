package com.Class2;

import java.util.Scanner;

public class TestClass {

	public static void main( String []args ) {
		
		//System.out.print(-21%4);
//		double  GPA=3.2;
//		boolean diploma=true;
//		
//		if ( diploma ) {
//			System.out.println("Congrats on all the knowledge ");
//			
//			if (GPA >=3.5) {
//			System.out.println("You are eligible for a Scholarship");
//		} else 
//		{
//			System.out.println("you should of studied harder");
//		}
//		}else {
//			System.out.println("Get a degree ");
//		}
	
//		double rate =3.5;
//		int price = 100000;
//		if (rate< 4.5 ) {
//			System.out.println("Buying the house ");
//		if (price <200000) {
//			System.out.println("I am paying cash");
//		} else {
//			System.out.println("I am  financing ");
//		}
//		}
//		else {
//			System.out.println("UUser is not buying ");
//			
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int Firstnumber = scan.nextInt();
		
		System.out.println("Entered second number   "  );
		int SecondNumber = scan.nextInt();
		
		if(Firstnumber > SecondNumber) {
			System.out.println("Frist number is bigger");
		}else if (Firstnumber == SecondNumber ) {
			System.out.println("Numbers are the same");
		}
		else {
			System.out.println("Second Number is bigger");
		}
		
	}
		
	}
	
 
