package com.shil.sample.project;

public class Recursion {

	
	public static void reduceByOne(int n) {
		
		if(n>=0) {
		reduceByOne(n-1);
	}
		System.out.println("method calling: " +n);
	}
	public static void main(String[] args) {
		Recursion.reduceByOne(10);
		
		

	}

}
