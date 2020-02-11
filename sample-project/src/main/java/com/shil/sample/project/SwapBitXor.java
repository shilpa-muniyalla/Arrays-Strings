package com.shil.sample.project;

import java.util.*;


public class SwapBitXor {

	public static void main(String[] args) {
		
		int num1,num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=scan.nextInt();
		System.out.println("Enter the second number");
		num2=scan.nextInt();
		scan.close();
		
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("First number after swapping is: " +num1);
		System.out.println("Second number after swapping is: "+num2);
		

	}


}

/*public class SwapBitXor {
public static void main(String[] args) {
	
	int num1,num2,num3;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number");
	num1=scan.nextInt();
	System.out.println("Enter the second number");
	num2=scan.nextInt();
	scan.close();
	
	num3=num1;
	num1=num2;
	num2=num3;
	
	System.out.println("First number after swapping is: " +num1);
	System.out.println("Second number after swapping is: "+num2);
	

}


}*/
