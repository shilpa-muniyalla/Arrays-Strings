package com.shil.sample.project;

public class ArraySearch {
	
	public boolean checkArraySearch(int[] number,int a) {
		boolean b=false;
		for(int i=0; i<number.length; i++) {
			if(a==number[i]) {
				System.out.println("the array search number is: " +i);
				b=true;
				return true;
				
			}
		}
		return false;
	/*	if (b==false) {
			System.out.println("the number is not found in the array");
			
		}*/
		
	

	}
	public static void main(String[] args) {
		ArraySearch arraySearch = new ArraySearch();
		int[] input= {1,2,3,4,5,6};
		int x=3;
		arraySearch.checkArraySearch(input,x);

	}

}
