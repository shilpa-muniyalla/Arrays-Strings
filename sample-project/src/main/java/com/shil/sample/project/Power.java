package com.shil.sample.project;

public class Power {
	int result =1;
	public void checkPower(int number,int power) {
		for(int i=0 ; i<power ; i++) {
			result=result*number;
			
		}
		System.out.println("the output is "+result);
		
	}
	
	public static void main(String[] args) {
		Power power = new Power();
		power.checkPower(2, 5);
		
		
		
	}

}
