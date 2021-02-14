package javaP;

public class ClassA2 {

	int t = 4;
	
	public void checkEvenOdd() {
		System.out.println("Checking - even odd");
		
		// Checking - even odd - Logic
		if(t%2 == 0) {
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
	
	public void checkPrime() {
		int k = 0;
		
		for(int i = 2; i <= t; i++) {
			//Code
			if(t%i == 0) {
				k++;
				System.out.println("K is = " + k);
			}
		}
		
		//=====================
		
		if(k == 1) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

	public void calcFact() {
		int result = 1;
		
		for(int i =t; i>= 1; i--) {
			result = result * i;
		}
		
		System.out.println(result);
	}

	public void incDecTest() {
		//System.out.println(t++);
		
		//System.out.println(++t);
		
	}
	
	public void revString() {
		String s = "Java";
		String result = "";
		
		char[] arr = s.toCharArray();
		
		int arrayLen = arr.length;
		System.out.println("arrayLen = " + arrayLen);
		
		for(int k = arrayLen-1; k >=0; k--) {
			//System.out.println(arr[k]);
			result = result + arr[k];
		}
		System.out.println(result);
	}

	//Assignment
	public void revNum() {
		int t = 54321;   // => 12345
		
	}
	
	
	public static void main(String[] args) {
		ClassA2 obj = new ClassA2();
		obj.revString();
	}
}
