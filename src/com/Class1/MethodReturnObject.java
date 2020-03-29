package com.Class1;
import java.util.*;
import java.util.Map.Entry;
import java.util.Set;
public class MethodReturnObject {

	public static void main(String[] args) {
		
//		List<String> list=returnStringList("Java", "My favorite subject");
//		System.out.println(list);
//		Scanner scan = returnScanner();
//		String scanStr1 = scan.next();
//		String scanStr2 =scan.next();
//		returnStringList(scanStr1,scanStr2);
		//---------------------------------------------------------
		 Map<String, String> hMap = new HashMap<>();
		  hMap.put("Street", "Patrick ST");
		  hMap.put("Suite", "265");
		  hMap.put("City", "Vienna");
		  hMap.put("Zip", "22180");
		  hMap.put("Country", "United State");
		  for (Map.Entry<String,String> entry : hMap.entrySet()) {
			  
			  System.out.println(entry.getValue().toUpperCase());
		  }
		   Iterator<Map.Entry<String, String>> hMapIt= hMap.entrySet().iterator();
		   while(hMapIt.hasNext()) {
			   System.out.println("----------------------------- ");
			   System.out.println(hMapIt.next().getKey().toLowerCase());
		   }
		   
		   Map<Integer , Double> tMap = new TreeMap<>();
		   tMap.put(1, 1.1);
		   tMap.put(2, 2.2);
		   tMap.put(3, 3.3);
		   tMap.put(4, 4.4);
		   tMap.put(5, 5.5);
		   boolean b;
		   b=false;
		   
	for (Map.Entry<Integer,Double> val: tMap.entrySet()) {
		
		if ( val.getKey().intValue()==3 ) {
			b= true;
			System.out.println(b); 
		 
		}   if  ( val.getValue().doubleValue() == 4.4  ) {
			 b=true;
			System.out.println(b); 
		}
		  if(  val.getKey().intValue()==6  ) {
			 b= true;
			  System.out.println(b); 
		  }else {
			  b=false;
		  }
	}
		   
	System.out.println(b); 
		   
	 
	Map<String, String> map = new HashMap<>();
	
	map.put("ONE","AAA");
	map.put("TWO","BBB");
	map.put("THREE","CCC");
	map.put("FOUR","DDD");
	map.put("FIVE","EEE");
	 
	Iterator<Map.Entry<String, String>> itrEntry1 = map.entrySet().iterator();
	System.out.println("HashMap Before Remove :");
 
	while(itrEntry1.hasNext()) {
		Entry<String, String> ent=itrEntry1.next();
		String entry=ent.getKey()+":"+ent.getValue();
		System.out.println(entry);
	}
	
	map.remove("ONE");
	map.remove("FOUR");
	System.out.println("HashMap After Remove :");	
	Iterator<Map.Entry<String, String>> itrEntry2= map.entrySet().iterator();
while(itrEntry2.hasNext()) {
	Entry<String,String> ent=itrEntry2.next();
	String entry = ent.getKey() +":"+ent.getValue();
	System.out.println(entry);
}
	
System.out.println("-------------------------------------");
	 Map<String,String> hashM= new HashMap<>();
		hashM.put("ONE","AAA");
		hashM.put("TWO","BBB");
		hashM.put("THREE","CCC");
		hashM.put("FOUR","DDD");
		hashM.put("FIVE","EEE");
		Iterator<Map.Entry<String, String>> itrM = hashM.entrySet().iterator();
		while(itrM.hasNext()) {
			Entry<String,String> nextEntry = itrM.next();
			System.out.println(nextEntry);
		}
	System.out.println("----------------------------------");	
		hashM.replace("THREE", "CCC", "ASEL");
		hashM.replace("FIVE", "EEE","SUMAIR");
		Set <Entry<String, String>> mySetOfEntries = hashM.entrySet();
		for (Entry<String,String> entry:mySetOfEntries )  {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
			
			
		}
	}
	
	


	
//	Create Hash Map. 
//	add the follow values
//
//	map.put("ONE","AAA");
//	map.put("TWO","BBB");
//	map.put("THREE","CCC");
//	map.put("FOUR","DDD");
//	map.put("FIVE","EEE");
//
//	print the key and values pairs using iterator only
//
//	replace with below key THREE--> ASEL and key FIVE-->SUMAIR
//
//	Print the values using any kind of loops you like.
//
//	OUTPUT
	
	
	
	
	//Output
//	HashMap Before Remove :
//		FIVE : EEE
//		ONE : AAA
//		FOUR : DDD
//		TWO : BBB
//		THREE : CCC
//		------------------
//		HashMap After Remove :
//		FIVE : EEE
//		TWO : BBB
//		THREE : CCC
	
	
//	Create a Hash Map of String pairs 
//	add the follow values
//	map.put("ONE","AAA");
//	map.put("TWO","BBB");
//	map.put("THREE","CCC");
//	map.put("FOUR","DDD");
//	map.put("FIVE","EEE");
//
//	print the key and values pairs using loop
//
//	Remove below from Map
//	"ONE"
//	"FOUR"
//
//	Print key and values pairs using loop
	
//	Create A TreeMap of Integer, Double
//	Add the below values
//
//	1  1.1
//	2  2.2
//	3  3.3
//	4  4.4
//	5  5.5
//
//	validate below and print the results 
//	is Contain Key 3?
//	is Contain Values 4.4?
//	is Contain  key 6?
	
	
	
	
	//Create a HashMap of String. 
	//Add below pair to it . 
	//"Street" = "Patrick ST"
	//"Suite" = "265"
	//"City" = "Vienna"
	//"Zip" = "22180"
	//"Country" = "United State"
	//
	//Print all the values using entrySet in upper case. 
	
	
	//-----------------------------------------------
	//create a method that will return an Object of Scanner Class
	public static Scanner returnScanner() {
		Scanner scan=new Scanner(System.in);
		
		return scan;
	}
	//create a method that will return an Object of List Class
	public static List<String> returnStringList(String str, String str1) {
		
		List<String> list=new ArrayList<>();
		list.add(str);
		list.add(str1);
		System.out.println(str + " "  + str1);
		return list;
	}
	public static Map<String, String > returnMap(String key, String value, String key1, String value1){
		Map<String ,String > map = new HashMap<>();
		map.put(key, value);
		map.put(key1, value1);
		return map;
	}

	
	
	
	}


