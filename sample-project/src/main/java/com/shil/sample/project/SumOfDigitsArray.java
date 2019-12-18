package com.shil.sample.project;

public class SumOfDigitsArray {
	
	public static void checkSumOfDigitsArray(int[] array) {
		int result=0;
		for(int i=0;i<array.length;i++) {
			result=result+array[i];
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int[] array= {1,3,3,4,5};
		checkSumOfDigitsArray(array);
		

	}

}
