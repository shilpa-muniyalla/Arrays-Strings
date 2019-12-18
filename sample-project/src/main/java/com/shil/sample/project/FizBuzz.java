package com.shil.sample.project;

public class FizBuzz {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		for(int i=1;i<=100;i++) {
			
			if(i%a==0 && i%b==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%a==0) {
				System.out.println("fizz");
			}
			else if(i%b==0) {
				System.out.println("Buzz");
			}
			
			else {
				System.out.println(i);
				
			}
		}

	}

}
