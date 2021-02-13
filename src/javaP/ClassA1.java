package javaP;

public class ClassA1 {

	int i = 10;
	
	String s = "Java";
	
	public void method1() {
		//System.out.println("Java");
		
		System.out.println("s");
		System.out.println(s);
	}
	
	
	public static void main1(String[] abc) {
		//Object create 
		//className objName = new ClassName();
		
		ClassA1 obj = new ClassA1();
		obj.method1();
		
		ClassA1 obj1 = new ClassA1();
	}
	
}

/* public - pritected - private - default => difference between them  ?
 * 
 * 
 * */
