package com.Class2;

public class VariableDeclaration {
	
	public static void main(String [] args) {
		int width =5 ;
		int height = 8;
		
		int area = width * height;
		int perimeter = 2* (width + height);
		
		String message = " The perimmiter of rectangle with witdth " + width 
				+ " and height  " + height + " is equal to " + perimeter 
				+ " and the area is " +  area;
		
		System.out.println(message);
		
	}

}
