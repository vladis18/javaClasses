package com.Class1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HushMapMethod {
public static void Display(Map<String,Integer> hMap) {
	if (!hMap.isEmpty()) {
		Set <Entry<String, Integer>> mySetOfEntries = hMap.entrySet();
		for(Entry<String,Integer> hEntry:mySetOfEntries ) {
			System.out.println(hEntry.getKey() +":"+ hEntry.getValue());
		}
	}
	else {
		System.out.println("map is empty");
	}
}
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//add values as below
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		//HushMapMethod.Display(map);
		 Display(map);
		 map.clear();
		 Display(map);
	Map<String, Integer> map1 = new HashMap<>();	 
	map1.put("mango", 10); 
	map1.put("apple", 30); 
	map1.put("orange", 20); 
	map1.put("mango", 40); 
	 map1.put("mango", 40);    
		System.out.println(map1);
		List<Map<String,Object> >aList = new ArrayList<>();
		Map<String, Object> appleMap = new HashMap<>();
 appleMap.put("Items", "Apple");
 appleMap.put("Price",  20.00);
 appleMap.put("Quantity", 10);
	aList.add(appleMap);
	//Step 4: Create orangeMap<String, Object> and add below pairs into it. 
		Map<String, Object> orangeMap = new HashMap<>();
orangeMap.put("Items", "Orange");
orangeMap.put("Price", 21.99);
orangeMap.put("Quantity", 10);
	//"Items", "Orange" 
	//"Price", 21.99
	//"Quantity", 10	
 
	aList.add(orangeMap);
	 
	//Step 7: Retrieve each Key and store is in a variable. 
	//Step 8: calculate the subtotal of each object. 
	//Step 9: Print the values of each Iteration same as shown below in Output example. 
	//Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase. 
	String mapKey="";  
	Object mapValue=null; 
	double price=0;
	int quantity=0;
	
	double subTotal=0 ;
//	for (Map.Entry<String, Object> ent : appleMap.entrySet()) {
//		 mapKey = ent.getKey();
//		 mapValue = ent.getValue();
//		 if (ent.getKey().contains( "Price")){
//			 price = (double) ent.getValue();;
//		 }
//		 if (ent.getKey().contains("Quantity")) {
//			 quantity = (int) ent.getValue();
//			 
//		 }
//	
//			System.out.print(mapKey + ": " + mapValue + " SubTotal: " + subTotal );
//	}
	
	 
Iterator<Map.Entry<String , Object>> it = appleMap.entrySet().iterator();

 while(it.hasNext()) {
	Entry<String,Object > nextMapEntry = it.next();
	
	mapKey= nextMapEntry.getKey();
	if (nextMapEntry.getKey().contains("Price")){
	
	mapValue=nextMapEntry.getValue();
	price =   (double) mapValue; 
	}
	if (nextMapEntry.getKey().contains("Quantity")){
		
		mapValue=nextMapEntry.getValue();
		quantity =   (int) mapValue; 
		}
	 //System.out.println("Price:" + price + " Quantity: " + quantity +" Subtotal: " + subTotal );
 subTotal = price * quantity;
//  System.out.print(mapKey + ": " + mapValue   );
//  
//  System.out.println(" SubTotal: " + subTotal);
 }
  
 System.out.println("Price:" + price + " Quantity: " + quantity +" Subtotal: " + subTotal );
	}
}

//Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList. 
//Step 2: Create appleMap<String, Object> and add below pairs into it. 
//"Items", "Apple"
//"Price", 20.00
//"Quantity", 10
//Step 3: Add appleMap to dataList. 
//Step 4: Create orangeMap<String, Object> and add below pairs into it. 
//"Items", "Orange" 
//"Price", 21.99
//"Quantity", 10
//Step 5: Add orangeMap to dataList. 
//Step 6: Create a loop from dataList. 
//Step 7: Retrieve each Key and store is in a variable. 
//Step 8: calculate the subtotal of each object. 
//Step 9: Print the values of each Iteration same as shown below in Output example. 
//Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase. 
//
//Step 11: After Loop Print the value of Total Purchase. 
//
//NOTE: as the values are Object you have to do casting properly while retrieving from for each map. 
//
//Output: 
//
//Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
//Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998
//Your Purchase total : 419.9



//Create HashMap 
//add values as below
//map.put("mango", 10); 
//map.put("apple", 30); 
//map.put("orange", 20); 
//map.put("mango", 40); 
// map.put("mango", 40);     
//
//Print the hash map. 
//output 
//
//{orange=20, apple=30, mango=40}









//HashMap, Methods, reusability, Logic
//Create a Method in Main class using below specification. 
//Method Name: Display. 
//Return Type: Void
//Parameters : Map<String,Integer>
//Logic: 
//First the method will check the given map is empty or not. 
//If the map is not empty print pairs of key and value using loops
//If map is empty simply print "map is empty"
//
//NOW IN MAIN METHOD
//Create HashMap of String keys and Integer values
//add values as below
//map.put("mango", 10); 
//map.put("apple", 30); 
//map.put("orange", 20); 
//
//using created display method to display. 
//
//then clear the map. 
//
//use the same method to display