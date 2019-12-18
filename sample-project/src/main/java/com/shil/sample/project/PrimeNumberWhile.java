package com.shil.sample.project;

public class PrimeNumberWhile {
	public void checkPrimeNumberWhile(int number) {
		int y=(int) Math.sqrt(number);
		int i=3;
		int a=0;
		if(number%2==0) {
			System.out.println("this is not a prime number");
			return;
		}
		
		while(i<=y) {
			if(number%i==0) {
				System.out.println("this is not a prime number");
				 a=1;
				 
				 break;}
			i=i+2;
				
			}
		
		
		if(a==0) {
			System.out.println("This is a prime number");
		}
	}

	public static void main(String[] args) {
		int x=31;
		PrimeNumberWhile prime=new PrimeNumberWhile();
		prime.checkPrimeNumberWhile(x);

	}

}
