package javaP;

public class ClassA3 {
	
	//Constructor - is a special method which execute automatically when object is created.
	//1. Its name must be same as class name.
	//2. It doesnt have any return type, not even void.
	
	public ClassA3() {
		System.out.println("Hi");
	}
	
	public ClassA3(int t) {
		System.out.println(t * 2);
	}
	
	

	public void method1() {
		//Code
		System.out.println("Java 7");
	}
	
	public void method1(String s) {
		//Code
		System.out.println("Java 8");
	}
	
	//Method overloading
	
	public static void main(String[] args) {
		ClassA3 obj = new ClassA3(5);
		obj.method1();
		
		ClassA3 obj1 = new ClassA3();
	}
}
