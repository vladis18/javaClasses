package com.Class1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsHomeWork {

	public static void main(String[] args) {
		
		ArrayList<String >CarList=new ArrayList<>();
		CarList.add("Acura");
		CarList.add("BMW");
		CarList.add("Lexus");
		CarList.add("Bugatti");
		
		//retrieving values
		System.out.println(CarList.get(2));
		for(int num=0; num<CarList.size(); num++) {
			
			System.out.println(CarList.get(num));
		}
	
Iterator  it= CarList.iterator();
List <String> list =   new ArrayList<>();
list.add("Cute");
list.add("Love");
list.add("Hello");
list.add("Java");
Iterator<String > itr = list.iterator();
while(itr.hasNext()) {
	if(itr.next().endsWith("o")) {
		itr.remove();
	}
}
System.out.println(list);


ArrayList<String >DrinkList=new ArrayList<>();
DrinkList.add("cola");
DrinkList.add("milk");
DrinkList.add("cofee");
DrinkList.add("tea");
DrinkList.add("coke");

System.out.println("---------------------------------");

Iterator<String > myItr = list.iterator();
//while(myItr.hasNext()) {
//	if(myItr.next().endsWith("e")) {
//		DrinkList.set( 0, "water");
 	//}
	for (int i = 0; i<DrinkList.size();i++) {
		if (DrinkList.get(i).contains("a")|| DrinkList.get(i).contains("e")){
			DrinkList.set( i, "water");
		}
	}
 
System.out.println(DrinkList);


ArrayList<Integer>eNums=new ArrayList<>();
  
for(int num=1; num<50; num++) {
	if(num%2==0) {
		eNums.add(num);
	}
	System.out.println( num );
}
Iterator<Integer>iTr=eNums.iterator();
while(iTr.hasNext()) {
	if(iTr.next()%5==0) {
		iTr.remove();
	}
}
System.out.println(eNums);
	}

}
