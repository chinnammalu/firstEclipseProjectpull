package java8practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Lamdaexpression {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//it is use to implement functional interface.we don't need write method for implementation
//it reduces coding
//we can write no of impletion for that method
//Syntax: (argument-list)->{body};
		lamdainterface obj=()->{
			System.out.println("functionala interface....");	
			};
   		obj.draw();
   		lamdainterface obj1=()->{
			System.out.println("second functionala interface....");		
   		};
   		
   		obj1.draw();
   Runnable robj=()->{		
		System.out.println("Runnable interface.................");
	};
	Thread tr=new Thread(robj);
	tr.start();
    
	List<Employee> emplist=new ArrayList<Employee>();
	
	emplist.add(new Employee(1,"ammulu",50000));
	emplist.add(new Employee(3,"raghu",10000));
	emplist.add(new Employee(1,"lavanya",20000));
	
	/*Collections.sort(emplist,(n1,n2)->{
		return n1.ename.compareTo(n2.ename);
	});*/
	
	Stream<Employee> list=emplist.stream().filter(e->e.esal>10000);
	
	list.forEach((p)->{
		System.out.println("list...."+p.ename+"......"+p.esal);
	});
	

	
	
	
	
}}
