package com.Class1;

public class toString {

	public static void main(String[] args) {
		int month = 1;
		int day =  2;
		long year = 2000;
		   Integer Intobj = new Integer(month); 
		   String Month = Intobj.toString(Intobj);
		   Integer Intobj2 = new Integer(day); 
		   String Day= Intobj.toString(Intobj2);
		   Long Intobj3 = new Long(year); 
		   String Year= Intobj3.toString(Intobj3);
		   
		   String  birthday = Month.concat("/").concat(Day).concat("/").concat(Year);
		   
System.out.println(birthday);
	}

}
