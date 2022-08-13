package java8features;

public class FunctionalInterfaceExample implements  Sayab{
	@Override
	public void say(String msg) {
		// TODO Auto-generated method stub
	    System.out.println("enter say method......");
	}


	public static void main(String[] args) {
		FunctionalInterfaceExample obj=new FunctionalInterfaceExample();
		obj.say("hello");
		obj.m1();

	}

	
}
