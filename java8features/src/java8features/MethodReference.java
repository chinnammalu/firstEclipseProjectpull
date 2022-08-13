package java8features;

public class MethodReference {
      
	   public static  void  m1() {
		   System.out.println("m1 method.......");
	   }
	   
	   public void m2() {
		   System.out.println("m2 method.......");

	   }
	   MethodReference(){
		   System.out.println("MethodReference............");
	   }
	
	public static void main(String[] args) {
		
		Sayable sal=MethodReference::m1;
		sal.fly();
		//Sayable sal1=new MethodReference()::m2;
	    //sal1.fly();
		Sayable s1=MethodReference::new;
		s1.fly();

	}

}
