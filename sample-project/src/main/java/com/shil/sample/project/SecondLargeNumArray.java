package com.shil.sample.project;

public class SecondLargeNumArray {

	public static void checkSecondLargeNumArray(int[] array) {
		int n=array.length;
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
		}
		
		System.out.println(array[array.length-2]);
	}
	public static void main(String[] args) {
		int[] array= {30,70,60,45};
		checkSecondLargeNumArray(array);


	}

}
