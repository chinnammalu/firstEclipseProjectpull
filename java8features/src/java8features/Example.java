package java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example {
	
	public static void main(String ag[]) {
		
		List list=new ArrayList();
		
		list.add("hii");
		list.add("hello");
		list.add("welcome");
		list.add("to");
		list.add("hydrabad");
		
		list.forEach(
				(n)->System.out.println(n)
				);
		
		Map<String,Integer>  strmap=new HashMap<String,Integer>();
		strmap.put("sno", 1);
		strmap.put("sid", 3);
		strmap.put("scno", 2);
		
		
		strmap.remove("sid");
		Set<String> str=strmap.keySet();
		
		for(String s1:str) {
			System.out.println(strmap.get(s1));
			
		}
		
		
		
		
		
	}

}
