package com.shil.sample.project;

public class PrimeNumber {

	public static void checkPrimeNumber(int number) {
		boolean isPrime = false;
		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				isPrime = true;
				System.out.println("this is not a prime number " + number);
				break;

			}
		}
		if (isPrime == false) {

			System.out.println("This is a prime number " + number);

		}
	}

	public static void main(String[] args) {
		int a =20;

		checkPrimeNumber(a);
	}
}
