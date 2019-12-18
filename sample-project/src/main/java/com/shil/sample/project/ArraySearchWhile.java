package com.shil.sample.project;

public class ArraySearchWhile {
	
	public void checkArraySearchWhile(int[] x,int a) {
	int i=0;
	boolean b=false;
	while(i<x.length) {
		if(a==x[i]) {
			b=true;
			System.out.println(i);
			break;
			
		}
		i++;
	}
	if(b==false) {
		System.out.println("the number not found");
	}
	}
	
	
			
		
	

	public static void main(String[] args) {
		ArraySearchWhile a = new ArraySearchWhile();
		int[] number = new int[6];
		number[0]=1;
		number[1]=2;
		number[2]=3;
		number[3]=4;
		number[4]=5;
		number[5]=6;
									
		int y=4;
		a.checkArraySearchWhile(number, y);

	}

}
