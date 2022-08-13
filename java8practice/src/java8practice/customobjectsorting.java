package java8practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class customobjectsorting {

	public static void main(String[] args) {
	
		List<Employee> list=Arrays.asList(new Employee(5,"hari",50000),new Employee(2,"ammulu",10000),new Employee(3,"raju",30000));	
		
		list.forEach((e)->System.out.println(e.getEname()));
		
		/*List<Employee> sortedlist=list.stream().sorted(Comparator.comparing(Employee::getEname)).collect(Collectors.toList());
				
		sortedlist.forEach((e)->System.out.println(e.getEname()));*/
		
		List<Employee> sortedlist=list.stream().sorted(Comparator.comparingInt(Employee::getEid)).collect(Collectors.toList());

		sortedlist.forEach((e)->System.out.println(e.getEname()));
		
		String str="ammulu";
		HashMap<Character,Integer> strmap=new HashMap<Character,Integer>();
		
	     for(int i=0;i<str.length();i++) {
	    	 
	    	 if(strmap.containsKey(str.charAt(i))) {
	    		 strmap.put(str.charAt(i),strmap.get(str.charAt(i))+1);
	    	 }else {
	    		 strmap.put(str.charAt(i),1);
	    	 }
	    	 
	    	
	    	 
	    //	 HashMap<Character,Integer> strsort= strmap.entrySet().stream().filter(n->n>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	    	
	    	// Map<Character,Integer> filteredMap = strmap.entrySet().stream().filter(x->x.getKey() >1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	    	 
	    //	 filteredMap.entrySet().forEach(obj->System.out.println(obj.getValue()));
	    	 
	     }
	    
		
		
		Map<Character,Integer> sortedmap=strmap.entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				
		sortedmap.entrySet().forEach(x->System.out.println(x.getKey()));
		
		List<Product> list1=new ArrayList<Product>();  
        
        //Adding Products  
		list1.add(new Product(1,"HP Laptop",25000f));  
		list1.add(new Product(3,"Keyboard",300f));  
		list1.add(new Product(2,"Dell Mouse",150f));  
          
        System.out.println("Sorting on the basis of name...");  
  
		 // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{  
        return p1.name.compareTo(p2.name);  
        });  
        
        for(Product p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
        
        
        
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);  
        
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
        
			}

}
