package pack03;

public class ClassA2 {

	//Constructor - is a special method, which execute automatically when object is created.
	
	//1. Its name must be same as class name
	//2. It doesnt have any return type, not even void.
	
	public ClassA2() {
		System.out.println("Java");
	}
	
	public void method1() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		ClassA2 obj = new ClassA2();
		obj.method1();
		
		/*
		 * ClassA2 obj2 = new ClassA2(); obj2.method1();
		 * 
		 * ClassA2 obj3 = new ClassA2();
		 */
		
	}
}
