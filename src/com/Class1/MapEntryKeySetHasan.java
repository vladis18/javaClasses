package com.Class1;
import java.util.*;
public class MapEntryKeySetHasan {

	public static void main(String[] args) {
		  List<Map<String, Object>> dataList=new ArrayList<>();
          Map<String, Object> appleMap=new LinkedHashMap<>();
          appleMap.put("Items", "Apple");
          appleMap.put("Price", 20.00);
          appleMap.put("Quantity", 10.0);
          
          dataList.add(appleMap);
          
          Map<String, Object> orangeMap=new LinkedHashMap<>();
          orangeMap.put("Items", "Orange");
          orangeMap.put("Price", 21.99);
          orangeMap.put("Quantity", 10.0);
          
          dataList.add(orangeMap);
          
          double subBotal, purchaseTotal=0;
          
          for(Map<String, Object> ent:dataList){
            for(String key:ent.keySet()){
              System.out.print(key+": "+ent.get(key)+" ");
            }
            double price=(double) ent.get("Price");
            double quantity=(double) ent.get("Quantity");
            
            subBotal=price*quantity;
            System.out.println("SubTotal: "+subBotal);
            purchaseTotal+=subBotal;
          }
          
          System.out.println("Your Purchase total : "+purchaseTotal);


	}

}
