package com.Class1;

import java.util.HashMap;
import java.util.Iterator;

public class Maps {

	public static void main(String[] args) {
		HashMap<Integer, String> mapBld=new HashMap<>();
		//to store key+value pair into map
		mapBld.put(1, "Google");
		mapBld.put(2, "Syntax");
		mapBld.put(3, "Amazon");
		mapBld.put(4, "Ikea");
		mapBld.put(5, "FurnitureXo");
		mapBld.put(6, "BestBuy");
		mapBld.put(7, "Nuts2U");
		int mSize =mapBld.size();
		System.out.println(mapBld + " " + mSize);
		mapBld.replace(4, "Burger King");
		mapBld.remove(7);
		System.out.println( " ---------------------------------"  );
		System.out.println(mapBld + " " + mSize);
		//
		 Iterator<Integer> it=mapBld.keySet().iterator();
			while(it.hasNext()) {
				  
				 Integer number = it.next();
 
				System.out.println(it.next());
				 
			}
		 // System.out.println(arrLst);
		
	}

}
