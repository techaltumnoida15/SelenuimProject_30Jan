package javaP;

public class ClassA5 extends ClassA4{

	public void method2() {
		//System.out.println("ClassA5 - method2()");
		super.method2();
	}
	
	public void method4() {
		System.out.println("ClassA5 - method4()");
	}
	
	public static void main(String[] args) {
		ClassA5 obj = new ClassA5();
		obj.method2();    //In case of overriding, always child(sub) class method will be called.
	}
	
}
