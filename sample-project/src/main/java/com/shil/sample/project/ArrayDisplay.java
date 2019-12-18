package com.shil.sample.project;

public class ArrayDisplay {
	
	//array reverse
	public static int[] checkArrayDisplay(int[] numbers) {
		int[] output= new int[numbers.length]; 
		int a=0;
		
		for(int i=numbers.length-1;i>=0;i--) {
			
		  output[a]=numbers[i];
			a++;
			
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input= {1,2,3,4};
		
		
             int[] x =(checkArrayDisplay(input));
             for(int y:x) {
             System.out.println(y);
	}

}
}
