package pack03;

public class ClassA3 {

	public void method1() {
		//If else
		
		//Loops
	}
	
	public void ifElse(){
		int t = 10;
		int r = 9;
		
		if(t > r) {
			System.out.println("t is greater");
		}
		else {
			System.out.println("r is greater");
		}
	}
	
	public void forLoopPractice() {
		//for, while, do while
		//foreach - collection framework - list, set hash map, hash table
		
		//for loop  - start, condition, increment/decrement
		
		for(int i = 1; i<=10; i++) {
			int t = i * 2;
			System.out.println(t);
			
			if(t == 8) {
				break;
			}
		}
		
	}
	
	public void whileLoop() {
		int i = 1;
		
		while(i <= 10) {
			//do this
			System.out.println(i);
			i++;
		}
	}
	
	public void calcFact() {
		int t = 5;
		int result = 1;
		
		for(t = 5; t >= 1; t--) {
			result = result * t;
		}
		
		System.out.println(result);
	}
	
	public void fibonacciSeries() {
		int firstNum = 0;
		System.out.println(firstNum);
		
		int secondNum = 1;
		System.out.println(secondNum);
		
		//System.out.println(firstNum + secondNum);
		
		for(int i = 1; i <= 6; i++) {
			int sum = firstNum + secondNum;
			System.out.println(sum);
			
			firstNum = secondNum;
			secondNum = sum;
			
			
			//System.out.println(firstNum + secondNum);
			
		}
	}

	public void revString() {
		String s = "Selenium";
		int strLen = s.length();
		String result = "";
		
		System.out.println("String length is = " + strLen);
		
		char a[] = s.toCharArray();
		
		for(int i = strLen - 1; i >= 0; i--) {
			//System.out.println(a[i]);
			result = result + a[i];
		}
		
		System.out.println(result);
		
	}
	
	public void revArray() {
		int[] arr = {2, 5, 6, 1};   //  => {1, 6, 5, 2}
		int len = arr.length;
		System.out.println("length is " +len);
	}
	
	public static void main(String[] args) {
		ClassA3 obj = new ClassA3();
		//obj.ifElse();
		//obj.forLoopPractice();
		//obj.whileLoop();
		//obj.calcFact();
		//obj.fibonacciSeries();
		//obj.revString();
		obj.revArray();
	}
}
