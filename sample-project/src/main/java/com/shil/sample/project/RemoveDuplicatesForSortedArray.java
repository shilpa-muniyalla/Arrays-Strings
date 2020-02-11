package com.shil.sample.project;

public class RemoveDuplicatesForSortedArray {
	
	public static int[] findRemoveDuplicatesForSortedArray(int[] array) {
		int[] output = new int[array.length];
		int j=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1]) {
				output[j]=array[i];
				j++;
			}
		}
		output[j]=array[array.length-1];
		return output;
	}

	public static void main(String[] args) {
		int[] array= {1,1,2,2,3,5,5};
		int[] output=findRemoveDuplicatesForSortedArray(array);
		for(int s:output) {
			System.out.println(s);
		}
		

	}

}
