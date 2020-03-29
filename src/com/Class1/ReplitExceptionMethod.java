package com.Class1;

public class ReplitExceptionMethod {
static void comparingNumber(Integer number) {
	if (number >10) {
		System.out.println("Number is greater that 10");
	}
	
	if (number < 10 ) {
	     try {
	    	 throw new  Exception("Number is less than 10"); 
		 }
	     
			catch (Exception ex ) {
				System.out.println(ex.getMessage());
		 
	}
	 
	}
} 
	public static void main(String[] args) {
		 comparingNumber(9);
	}

}


//Create a method with below Specification. 
//Method Label: comparingNumber. 
//return type: void
//parameter:  integer number.
//
//Method logic: 
//If the given number is greater that 10, Print out  "Number is greater that 10"
//else 
//throw exception and say "Number is less than 10"
//
//Handle exceptions in method using try and catch block and print the message only. 
//
//In Main method Call the method and pass 9 as parameter. 
//
//Ouptut: 
//
//Number is less than 10
