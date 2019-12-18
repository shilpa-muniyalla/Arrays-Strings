package com.shil.sample.project;

public class SumOfPairOfElementsInArray {
	
	public static void checkSumOfPairOfElementsInArray(int[] array,int number) {
		int n=array.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if((array[i]+array[j])==number) {
					System.out.println("the number is:" +array[i]+ "  "+  array[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = {4,5,7,11,9,13,8,12};
		checkSumOfPairOfElementsInArray(array,20);

	}

}
