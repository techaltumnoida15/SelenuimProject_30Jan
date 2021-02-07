package pack03;

public class ClassA1 {

	int i = 10;
	String s = "Hi";
	
	public void method1() {
		System.out.println("Hi");
		method2();
	}
	
	public void method2(int t) {
		System.out.println("Hello");
	}
	
	public void method2() {
		System.out.println("Hello 123");
	}
	
	//when there are 2 or more methods of same name in same class then it is called method overloading - It happens in same class only.
	
	public static void main(String[] args) {
		ClassA1 obj = new ClassA1();
		obj.method2();
	}
	
}
