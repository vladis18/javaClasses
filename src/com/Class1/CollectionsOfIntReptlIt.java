package com.Class1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsOfIntReptlIt {
	 public LinkedList<String> myLlist() {
		LinkedList<String> myList=new LinkedList<>();
		myList.add("John");
		myList.add("Brian");
		myList.add("Ryan");
		return myList;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> listA= new ArrayList<>();
ArrayList<Integer> listB = new ArrayList<>();
for (int i =0; i<=5;i++) {
	listA.add(i);
}
System.out.println(listA);
Iterator<Integer> it = listA.iterator();
Iterator<Integer> it2 = listA.iterator();
 while (it.hasNext() && it2.hasNext()){
	 
	 listB.add(it.next());
	 listB.add(it2.next());
	 
 }
 System.out.println(listB);
 
 ArrayList <Boolean>listC= new ArrayList<>();
 ArrayList<Boolean>listD =new ArrayList<>();
 listC.add(true);
 listC.add(false);
 listC.add(false);
 System.out.println(listC);
 listD.addAll(listC); 
 listD.addAll(listC);
 System.out.println("list D " + listD);
 
 LinkedList<String> lList= new LinkedList<>();
 CollectionsOfIntReptlIt obj = new CollectionsOfIntReptlIt();
 System.out.println(obj.myLlist());
   lList.addAll(obj.myLlist());
   //Iterator<String> myIt = obj.myLlist().iterator();
   Iterator<String> myIt = lList.iterator();
   while(myIt.hasNext()) {
	   System.out.println(myIt.next());
   }
   
   int iValue= 111;
   int iSum=0;
   
   LinkedList<Integer> list = new LinkedList<>();
   for (int i=1; i<=6;i++) {
	   list.add(iValue *i);
   }
   System.out.println(list);
   Iterator<Integer> iTer =list.iterator();
   while (iTer.hasNext()) {
	  iSum= iSum+ iTer.next();
   }
   System.out.println(iSum);
 
   HashSet<String> hset = new HashSet<String>();
   hset.add("Red");
   hset.add("Pink");
   hset.add("Yellow");
   hset.add("White");
   hset.add("Black");
   hset.add(null);
   hset.add(null);
   
   System.out.println("Original Hash Set: " + hset);
   System.out.println("Size of the Hash Set: " + hset.size());

   String str ;
   Iterator<String> iTr =hset.iterator();
   while (iTr.hasNext()) {
	   str =iTr.next() ;
;
   }
   boolean b = hset.contains(null) ;
   System.out.println(b);
   hset.removeAll(hset);
   System.out.println( hset);
}
}
//HashSet<String> hset = new HashSet<String>();
//Create a Hashset and add below values to it. 
//
//Red
//Pink
//Yellow
//White
//Black
//print the colors 
//and get total number of colors available in the set
//
//Output:
//Original Hash Set: [Red, Pink, White, Yellow, Black]
//Size of the Hash Set: 5

//Create a linkList of type Integer call list, 
//Add the values below. 
//111
//222
//333
//444
//555
//666
//
//Create a logic to calculate sum of the all the values in list. 
//
//Print the result only. 
//
//Output. 
//Result of sum is 2331
//LinkList and Methods. 
//Create a method the return an LinkList. without parameters. 
//inside the method put the logic to add below values to the linklist and return the list. 
//
//In Main Class. 
//call the method and store it to a new Linklist. 
//
//Print the values of LinkList. 
//
//
//Output
//
//John
//Brian
//Ryan





//LinkList and Methods. 
//Create a method the return an LinkList. without parameters. 
//inside the method put the logic to add below values to the linklist and return the list. 
//
//In Main Class. 
//call the method and store it to a new Linklist. 
//
//Print the values of LinkList. 
//
//
//Output
//
//John
//Brian
//Ryan






















//Create a ArrayList of Integers called listA
//add below values to it. 
//(0, 1, 2, 3, 4, 5)
//Create another array list of Integer. called listB
//
//Create a logic to the values of listA to listB twice for each values. 
//
//Print the listB
//
//Output
//[0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5]