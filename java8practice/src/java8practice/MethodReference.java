package java8practice;

public class MethodReference {
	/*public static void m1() {
		System.out.println("static m1 method.......");
	}
	public  void m1() {
		System.out.println(" non static m1 method.......");
	}
	*/
	public MethodReference() {
		System.out.println("constructor..........");

	}
	
	
	public static void main(String arg[]) {
	//	referenceInterface obj=MethodReference::m1;
	//MethodReference cobj=new MethodReference();
	//	referenceInterface obj=cobj::m1;
		referenceInterface obj=MethodReference::new;
		obj.draw();
		
		
	}

}
