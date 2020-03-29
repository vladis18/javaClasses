package com.Class1;

import java.util.ArrayList;
import java.util.Iterator;

public class ReplCollections {

	public static void main(String[] args) {
		 ArrayList <String> arrLst = new ArrayList<>();
		 arrLst.add("hi");
		 arrLst.add("yo");
		 arrLst.add("sup");
		 arrLst.add("yolo");
		 arrLst.add("boop");
		 System.out.println(arrLst);
		 //Use Iterator  and use remove method of iterator to remove the value
//  int iSize =arrLst.size();
//		 for (int i = 0 ; i<=iSize ; i++){
//		   if(i%2==0){
//			   arrLst.remove(i  );
//			 
//			   iSize = arrLst.size();
//			   for(int j=0;j<=arrLst.size();j++) {
//				   System.out.println(arrLst);
//				   if(j%2!=0){
//					   arrLst.remove(j  );
//					  // iSize = arrLst.size();
//				   continue;  
//			   }
//			   }
//		   }
//		 }
//		 System.out.println(arrLst);
//
		 Iterator<String> it=arrLst.iterator();
		// int size= arrLst.size();
			while(it.hasNext()) {
				String   itValue = it.next();
				
					for (int i  = 1; i<= arrLst.size()-1;i++) {
						
		            if (i % 2 == 0) {
		            	it.remove();
		            	
		                // arrLst.remove(itValue); 
		             if ( it.hasNext()) {
		            	 System.out.println(it.next());
		             }
		             }
		          
					 }
			
			}
			
			//  System.out.println(it.next());
		  System.out.println(arrLst);

	}

}
