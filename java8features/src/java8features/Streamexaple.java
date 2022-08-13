package java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamexaple {

	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<Product>();  
      
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  

        
       Set<Entry<Product, Long>> list= productsList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1L) .collect(Collectors.toSet());
                
        
        List<Product>   prlist=productsList.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());
        
        List<Product>  prlistname=productsList.stream().sorted(Comparator.comparing(Product::getName)).collect(Collectors.toList());
        
       // System.out.println("prlistname......"+prlistname);

        
        List<Float> Total=productsList.stream().filter(x->x.price>30000).map(Product::getPrice).collect(Collectors.toList());
        
        
    //	System.out.println("prlistname......"+prlistname);

        Set<Product> productPriceList=productsList.stream().filter(x->x.price>25000).collect(Collectors.toSet());
        for(Product pr:productPriceList) {
      //  	System.out.println("total1......"+pr.price);
        }
        
        Map<Integer,String> list=productsList.stream().collect(Collectors.toMap(p->p.id,p->p.name));
        
    //    System.out.println("list......"+list);
        
        
      //  List<Product>  list=productsList.stream().filter(x->x.getPrice()>28000).collect(Collectors.toList());
       // list.forEach(x->System.out.println(x.getName()));
     // List<Float> prlist=productsList.stream().filter(x->x.price>28000f).map(x->x.price).collect(Collectors.toList());
    //  prlist.forEach(x->System.out.println(x)); 
     //   Stream.iterate(2, n->n+5).limit(5).forEach(x->System.out.println(x));
       float total=productsList.stream().map(x->x.price).reduce(0.0f,(sum,p)->sum+p);
      // System.out.println("total......"+total);
       double total1=productsList.stream().collect(Collectors.summingDouble(x->x.price));
      // System.out.println("total1......"+total1);
       Product minval=productsList.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();    
     //  System.out.println("minval......"+minval);
       Product maxval=productsList.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
     //  System.out.println("maxval......"+maxval);
       long count=productsList.stream().filter(x->x.price>28000).count();
     //  System.out.println("countcount......"+count);
       
       
       
      
	}

}
