package java8features;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DoubleElementonArray {

	public static void main(String[] args) {
     int arr[]=new int[] {3,2,2,5,3,1};
     
     HashMap<Integer,Integer> strmap=new HashMap();
    for(int i=0;i<arr.length;i++) {
    	
    	
    	if(strmap.containsKey(arr[i])) {
    		strmap.put(arr[i],strmap.get(arr[i])+1);
    		System.out.println("duplicate.###..."); 
    	}else {
    		strmap.put(arr[i],1);
    	}
	}
     Set<Entry<Integer,Integer>> eset=strmap.entrySet();
     
     for(Entry<Integer,Integer> entry:eset) {
    	 
    	 if(entry.getValue()>1) {
    		System.out.println("duplicate...."+entry.getKey()); 
    	 }else {
    		System.out.println("....."+entry.getKey());
    	 }
    	 
 		System.out.println(".....");

    	 
     }
    
    
}
}
