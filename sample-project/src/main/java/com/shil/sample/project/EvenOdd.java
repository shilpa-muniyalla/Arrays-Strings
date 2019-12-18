package com.shil.sample.project;

public class EvenOdd {
	int value = 2;
	public String checkEvenOdd(int evenOddNumber) {
		if(evenOddNumber==0) {
			return "ZERO";
		}
		if(evenOddNumber%value==0) {
			System.out.println("This is even number" +" "+evenOddNumber);
			return "EVEN";
		}
		else {
			System.out.println("This is odd number" +" "+evenOddNumber);
			return "ODD";
		}
	}
	
	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd();
		evenOdd.checkEvenOdd(-1);
	}

}
