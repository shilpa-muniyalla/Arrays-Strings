//

package com.shil.sample.project;

public class SquareRoot {
	
	public void checkSquareRoot(int number) {
		int result=2;
		int i=2;
		while(result<=number) {
			result=i*i;
			i++;
		}
		System.out.println("the square root of :"+number +" is " +(i-2));
	}
	

	public static void main(String[] args) {
		SquareRoot squareRoot = new SquareRoot();
		squareRoot.checkSquareRoot(16);

	}

}
