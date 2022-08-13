package java8features;

import java.util.StringJoiner;

public class StringJoinerclass {

	public static void main(String[] args) {
         StringJoiner join=new StringJoiner(",","[","]");
         join.setEmptyValue("it is empty");
         
         System.out.println("join..."+join);
         join.add("hello");
         join.add("welcome");
         join.add("to");
         join.add("hydrabad");
		System.out.println(join);
        StringJoiner join2=new StringJoiner("");
        join2.add("good");
        join2.add("Morning");
        
        StringJoiner mergeelements=join.merge(join2);
        System.out.println(mergeelements);
        
		
	}

}
