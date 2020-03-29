package com.Class1;

import java.util.ArrayList;
import java.util.Iterator;

  

public class CollectionsTheBeginning {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		//WebDriver.driver = new ChromeDriver();
		
		ArrayList<String>arrayList=new ArrayList<>();
		//to store values inside you collection
		arrayList.isEmpty();
		arrayList.add("John");
		arrayList.add("Jane");
		arrayList.add("Jack");
		
		//to retrieve the value from arraylist
		System.out.println(arrayList.get(1));
		
		//add more values
		arrayList.add("James");
		arrayList.add("Johnny");
		arrayList.add("Janayan");
		
		//how many elements inside the arrayList?
		int size=arrayList.size();
		System.out.println(size);
		for (String arrList:arrayList) {
			System.out.println(arrList);
		}
		
		//creating an Object of ArrayList that will hold numberic values
		ArrayList<Double>numArrList=new ArrayList<>();
		numArrList.add(100.11);
		numArrList.add(200.12);
		numArrList.add(300.13);
		numArrList.set(2, 300.15);
		
		//retrieving values
		System.out.println(numArrList.get(2));
		for(int num=0; num<numArrList.size(); num++) {
			
			System.out.println(numArrList.get(num));
		}
		
		for(Double number:numArrList) {
			System.out.println(number);
		}	
ArrayList <Character> arrCharList = new ArrayList<>();
		arrCharList.add('a');
		arrCharList.add('b');
		arrCharList.add('c');
		arrCharList.add('d');
		arrCharList.add('e');
		arrCharList.add('f');
		arrCharList.add('g');
		for (int i = 0; i< arrCharList.size(); i++) {
			System.out.println(arrCharList.get(i));
			ArrayList <String> strList = new ArrayList<>();
			strList.add("Sveta");
			strList.add("Sasha");
			strList.add("Mohamad");
			strList.add("Alli");
			strList.add( "Zeynep");
		  if (!strList.isEmpty()) {
			  int mySize = strList.size();
			  for (int y = 0; y <mySize; y++) {
				  System.out.println( strList.get (y) );
				  System.out.println("---------------");
			  }
			  System.out.println(mySize);
		  }
			
			
			
		}
		System.out.println("=================================================================");
		int myI =111;
		
		ArrayList<Integer> iList= new ArrayList<>();
		   for (int i =1; i <=6; i++) {
		    if (iList.isEmpty()){
		      iList.add(myI);
		    }
		    else if (i > 1 ) {
		    	iList.add(myI * i );
		    }
		   
		   }
		   for (int element: iList) {
		System.out.println(element);
		   }
		   System.out.println(iList);
		   
		   ArrayList<Integer> myList=new ArrayList<>();
		   for (int i=1; i <=6;i++) {
			   if (i<=3) {
				   myList.add(myI);
			   }
			   else {
				   myList.add(myI *9);
			   }
		   }
		   for(int myElement: myList) {
			   System.out.println(myElement);
		   }
		 myList.removeAll(myList);
		 System.out.println("------------------------");
		 System.out.println(myList);
		 
		 System.out.println("------------------------");	 
		
		 
		 
//		 Iterator<String> it=arrLst.iterator();
//			while(it.hasNext()) {
//				  
//				 Integer number = it.next();
//
//		            if (number % 2 == 0) {
//		                numbers.remove(number);
//		            }
//				System.out.println(it.next());
//				 
//			}
//		  System.out.println(arrLst);
		 
  
	 
}
}
