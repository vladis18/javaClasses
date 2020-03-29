package com.Class1;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int [] array1 = {10,20,30};
		    try { 
		    System.out.println(array1[4]);
		    }
		    catch(ArrayIndexOutOfBoundsException exc ){
		      System.out.println(exc.getMessage()  );
		      System.out.println(exc.initCause(exc ));
		
		
		int a=20;
		int b=0;
		//System.out.println(a/b);
		
		System.out.println("Code after an exception");
		System.out.println("Continues code");
		
		int[] array= {10,20,30};
		System.out.println(array[3]);
		System.out.println();
		ArithmeticException exception=new ArithmeticException();
		 Throwable x = exception.getCause();
		 System.out.println(x);
		throw(exception );
		
		    }
	}

}
