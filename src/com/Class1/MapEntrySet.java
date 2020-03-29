package com.Class1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEntrySet {
	

	public static void main(String[] args) {
		
		String mapKey="";  
		Object mapValue=null; 
		double price=0;
		int quantity=0;
		double subTotal=0 ;
		List<Map<String,Object> >aList = new ArrayList<>();
		Map<String, Object> appleMap = new TreeMap<>();
 appleMap.put("Items", "Apple");
 appleMap.put("Price",  20.00);
 appleMap.put("Quantity", 10);
	aList.add(appleMap);
	
	
	 Set<String> entrySet1 =appleMap.keySet();
	 Iterator<  String >  entryItr=  entrySet1.iterator();
	 while(entryItr.hasNext()) {
		String entKV = entryItr.next();
		 
		 
		//Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
//		 if (eKey.contains("Price")){
//				
//				mapValue=entKV.getValue();
//				price =   (double) mapValue; 
//				}
//				if (eKey.contains("Quantity")){
//					
//					mapValue=entKV.getValue();
//					quantity =   (int) mapValue; 
//					}
//				
//				subTotal = price * quantity ;
////				
		 
		  System.out.println(entKV) ;
	 }
	
	//Step 4: Create orangeMap<String, Object> and add below pairs into it. 
		Map<String, Object> orangeMap = new HashMap<>();
orangeMap.put("Items", "Orange");
orangeMap.put("Price", 21.99);
orangeMap.put("Quantity", 10);
 
	aList.add(orangeMap);


 
//	 
//Iterator<Map.Entry<String , Object>> it = appleMap.entrySet().iterator();
//
// while(it.hasNext()) {
//	Entry<String,Object > nextMapEntry = it.next();
//	
//	mapKey= nextMapEntry.getKey();
//	if (nextMapEntry.getKey().contains("Price")){
//	
//	mapValue=nextMapEntry.getValue();
//	price =   (double) mapValue; 
//	}
//	if (nextMapEntry.getKey().contains("Quantity")){
//		
//		mapValue=nextMapEntry.getValue();
//		quantity =   (int) mapValue; 
//		}
//	 //System.out.println("Price:" + price + " Quantity: " + quantity +" Subtotal: " + subTotal );
// subTotal = price * quantity;
////  System.out.print(mapKey + ": " + mapValue   );
////  
////  System.out.println(" SubTotal: " + subTotal);
// }
//  
// System.out.println("Price:" + price + " Quantity: " + quantity +" Subtotal: " + subTotal );
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
