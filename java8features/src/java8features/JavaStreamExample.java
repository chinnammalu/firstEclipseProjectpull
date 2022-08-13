package java8features;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productlist=new ArrayList<Product>();
		List<Product> productlist1=new ArrayList<Product>();
		productlist.add(new Product(1,"Laptop",25000f));
		productlist.add(new Product(2,"Dell",35000f));
		productlist.add(new Product(3,"Apple",36000f));
		/*for(Product product:productlist) {
			if(product.price>30000) {
				productlist1.add(product);
			}
		}for(Product product:productlist1) {
			System.out.println("product....."+product.price);
		}*/
		List<Product> productlist2=productlist.stream().filter(p->p.price>30000).collect(Collectors.toList());
		System.out.println(productlist2);
		productlist2.forEach(
				(p)->{ System.out.println("enter list..."+p.price);}
				);
		Stream.iterate(1, n->n+1).filter(n->n%5==0).limit(5).forEach(System.out::println);
		float totalprice=productlist2.stream().map(product->product.price).reduce(0.0f,Float::sum);
		System.out.println("totalprice...."+totalprice);
		DoubleSummaryStatistics total3=productlist.stream().collect(Collectors.summarizingDouble(product->product.price));
		//double totalPrice3 = productsList.stream()  
        //        .collect(Collectors.summingDouble(product->product.price));  
		System.out.println("total3......"+total3);
		Product p=productlist.stream().min((n1,n2)->n1.price>n2.price ?1:-1).get();
		System.out.println("price min......"+p.price);
		Product pp=productlist.stream().max((n1,n2)->n1.price>n2.price ?1:-1).get();
		System.out.println("price of min......"+pp.price);
		long count=productlist.stream().filter(product->product.price<30000).count();
		System.out.println("count of elements......"+count);
		//Set s=productlist.stream();
		
		
	}

}
