package java8features;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpression {
	
	public static void main(String[] args) {
		LamdaExpression ln=new LamdaExpression();
		 System.out.println("enter m1 values......"+ln.m1());  	
		 
		 List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai"); 
	        list.forEach(
	        		(n)->System.out.println("names of person..."+n)  	        	
	        		);
	        
	        
	        
	}
  public int m1() {
	  

		System.out.println(ld.draw(100,200));  
		System.out.println(ld2.draw(300,200));  
	return 1;
  }
  
  lamda ld=(int a,int b)->{
		System.out.println("Welcome to India");
       return (a-b);
		};
	
		lamda ld2=(int a,int b)->{
			System.out.println("Welcome to India");
	       return (a+b);
			};

			
			

}
