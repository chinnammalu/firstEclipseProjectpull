package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collectorsclass {
	
	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>(); 
        productsList.add(new Product(1,"Laptop",35000f));
        productsList.add(new Product(2,"tab",45000f));
        productsList.add(new Product(3,"cell",25000f));
        
        
        
        productsList.add(new Product(3,"cell",25000f));
        
     //  List<Float> pricelist= productsList.stream().map(x->x.price).collect(Collectors.toList()).stream().filter(x->x>25000).collect(Collectors.toList());
       
     //  List<Product> pricelist1=productsList.stream().filter(x->x.price>25000).collect(Collectors.toList());
       
       
       productsList.stream().filter(x->x.price>25000).forEach(System.out::println);
       
       
      // System.out.println("list................"+list);
       Set<Float> list1=productsList.stream().map(x->x.price).collect(Collectors.toSet());
     //  System.out.println("set................"+list1);
       Integer sumId =productsList.stream().collect(Collectors.summingInt(x->x.id));  
       Double sumfloat=productsList.stream().collect(Collectors.summingDouble(x->x.price));
       System.out.println(sumId+"list................"+sumfloat);
       Double avarage=productsList.stream().collect(Collectors.averagingDouble(x->x.price));
       Long count=productsList.stream().collect(Collectors.counting());
       
       System.out.println("avarage....."+avarage+"count................"+count);




		
	}

}
