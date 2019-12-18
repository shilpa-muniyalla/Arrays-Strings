package com.shil.sample.project;

public class ArraySum {
	
	public void checkArraySum(int[] array) {
		int result = 0;
		for(int i = 0;i<array.length; i++) {
			result=result+array[i];
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
	ArraySum arraySum = new ArraySum();
	int[] input = {1,2,3};
		arraySum.checkArraySum(input);
	}

	}


