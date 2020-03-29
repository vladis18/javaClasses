package com.Class1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RepliTMaps {

	public static void main(String[] args) {
	 
HashMap<String, String > map = new HashMap<>();
map.put("Street", "Patrick ST");
map.put("Suite", "265");
map.put("City", "Vienna");
map.put( "Zip", "21180");
map.put("Country", "USA");
Set<String >myKset= map.keySet();
Iterator<String> itR = myKset.iterator();
while(itR.hasNext()) {
	String key =itR.next();
	System.out.println(map.get(key));
}

System.out.println(map.size());
map.clear();
System.out.println(map.size());
		

HashSet<String > hset = new HashSet<>();
hset.add("first");
hset.add("second");
hset.add("third");
hset.add("fourth");
hset.add("fifth");
String[] arr = new String [hset.size()];
String value;
int next=0;
 Iterator <String> it= hset.iterator();
 while(it.hasNext()) {
	 value= it.next();
	 arr[next]=value;
	 next=next+1; 
 }
 for (int i=0;i<=arr.length-1;i++) {
	 System.out.println(arr[i]);
 }
	}
}

//HashMap <String, String > myMap = new HashMap<>();
//
//KeySet<String> myKset = new KeySet<>();
//
//Create A hash Map of type pairs of String. 
//
//Add below pairs 
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//
//Print all the values using loop and KeySet. 
//
//Out put. 
//
//265
//22180
//Patrick ST
//United State
//Vienna

//Create a hashset contains below values. 
//first
//second
//third
//fourth 
//fifth 
//
//Create a logic to add the values of hashset to and array.
//
//print the values of array one by one. 
//
//Output:
//Array elements: 
//third 
//fifth 
//fourth 
//first 
//second






//Create a HashMap of String. 
//Add below pair to it . 
//
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//
//Find the size of keys . and print the size. 
//Clear the Map.
//Find the size again and print the size