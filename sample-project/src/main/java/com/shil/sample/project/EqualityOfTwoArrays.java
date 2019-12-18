package com.shil.sample.project;

public class EqualityOfTwoArrays {
	
	public static void findEqualityOfTwoArrays(int[] arrayOne,int[] arrayTwo) {
		boolean value=true;
		
		if(arrayOne.length==arrayTwo.length) {
			for(int i=0;i<arrayOne.length;i++) {
				if(arrayOne[i]!=arrayTwo[i]) {
					 value=false;
				}
				
			}
		}
		else {
			value=false;
		}
		
		if(value==true) {
		System.out.println("the arrays are equal");
		
	}
		else {
			System.out.println("the arrays are not equal");
		}
	}

	public static void main(String[] args) {
		int[] arrayOne= {2,3,4,5};
		int[] arrayTwo= {2,3,5,5,8};
		findEqualityOfTwoArrays(arrayOne,arrayTwo);
		
	}

}
