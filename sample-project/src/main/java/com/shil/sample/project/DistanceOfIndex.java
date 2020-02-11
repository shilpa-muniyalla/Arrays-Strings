package com.shil.sample.project;

public class DistanceOfIndex {
	
	public static int findDistanceOfIndex(int[] array,int a,int b) {
		int indexofa=0;
		int indexofb=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==a) {
				indexofa=a;
			}
			if(array[i]==b) {
				indexofb=b;
			}
		}
		return (indexofb-indexofa);
	}

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5};
		System.out.println(findDistanceOfIndex(array,2,6));
	}

}
