package com.shil.sample.project;

/*public class Factorial {

	public void checkFactorial(int number) {

		long output = number;
		for (int i = number - 1; i > 0; i--) {
			output = i * output;

		}

		System.out.println(output);

	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();

		factorial.checkFactorial(20);

	}

}*/

public class Factorial{
	public void checkFactorial(int number) {
		long output=number;
		int i=number-1;
		while(i>0) {
			output=i*output;
			i--;
		}
		
		System.out.println(output);
		}

	public int checkFactorialRecursion(int number) {
		
		if(number>0) {
		return	number*checkFactorialRecursion(number-1);
		
			
		}
		
		else {
			return 1;
		}
	}

public static void main(String[] args) {
	Factorial factorial = new Factorial();

	
	System.out.println(factorial.checkFactorialRecursion(5));

}
}

