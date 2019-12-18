package com.shil.sample.project;

public class ArrayReverse {

	/*public int[] arrayReverse(int[] array) {
		
		int[] reverse=new int[array.length];
		int x=0;
		for(int i=array.length-1; i>=0 ;i--) {
			reverse[x]=array[i];
			x++;
		}
		return reverse;

	}
	
	public static void main(String[] args) {
		int[] array= {10,20,30,40,50,60};
		ArrayReverse arrayReverse=new ArrayReverse();
		array=arrayReverse.arrayReverse(array);
		
		for(int y:array) {
		System.out.println(y);
	}
	}
	}*/
	
	public int[] arrayReverse(int[] array) {
		
		
		for(int i =0; i<array.length/2;i++) {
			int temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
			}
		
		return array;
		//for(int s:array) {
		//System.out.println(s);
	}
//	}
	public static void main(String[] args) {
		int[] array= {10,20,30,40,50,60};
		ArrayReverse arrayReverse=new ArrayReverse();
		array=arrayReverse.arrayReverse(array);
		for(int s:array) {
			System.out.println(s);
		}
	}
}
	


