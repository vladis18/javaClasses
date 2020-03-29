package com.Class1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapKeysValues {
	public static void main(String[] args) {
		//Create a map of a person(name,lastName, address, city, state)

		Map<String, String> CountryMap=new LinkedHashMap<>();
		CountryMap.put("Uzbekistan", "Tashkent");
		CountryMap.put("Russia", "Moscow");
		CountryMap.put("Ukrain", "Kiev");
		CountryMap.put("Israel", "Tel Aviv");
		CountryMap.put("USA", "D.C.");
		
		System.out.println(CountryMap);
		//how to retrieve a specific value?
		String value=CountryMap.get("Uzbekistan");
		System.out.println(value);
		
		//how to retrieve all keys and all values?
		Set<String> keys=CountryMap.keySet();
		
		System.out.println("-----Printing all keys using loop-------------");
		//how can I retrieve and print values key:value using for loop
		for(String key: keys) {
			System.out.println(key+":"+CountryMap.get(key));
		}
		
		System.out.println("-----Printing all keys using iterator-------------");
		//how can I retrieve and print values key:value using iterator
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			//System.out.println(keysIterator.next()+":"+ personMap.get(keysIterator.next()));
			String mapKey=keysIterator.next();
			String mapValue=CountryMap.get(mapKey);
			
			System.out.println(mapKey+"_"+mapValue);
		}
	}
}
