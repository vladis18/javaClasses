package com.Class1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapIterator {

	public static void main(String[] args) {
		// Create a map of a person(name,lastName, address, city, state)
				Map<String, String> CountryMap = new TreeMap<>();
				CountryMap.put("Uzbekistan", "Tashkent");
				CountryMap.put("Russia", "Moscow");
				CountryMap.put("Ukrain", "Kiev");
				CountryMap.put("Israel", "Tel Aviv");
				CountryMap.put("USA", "D.C.");

				System.out.println(CountryMap);
				System.out.println("-----Printing all values-------------");
				Collection<String> values = CountryMap.values();
				Collection<String> keys= CountryMap.keySet();
				
				
				for (String key : keys) {
				System.out.println(key.valueOf(keys)+ " " + values.contains(keys));
				}
System.out.println("---------------------------");
				Iterator<String> valuesIterator = values.iterator();
				while (valuesIterator.hasNext()) {
					System.out.println(valuesIterator.next());
				}

				 
			}

	}

 
