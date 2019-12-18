package com.shil.sample.project;

public class Gcd {
	int gcd;
	public int findGcd(int num1,int num2) {
		
		
		if(num1==0) {
			return num2;
		}
		
		if(num2==0) {
			return num1;
		}
		if(num1==num2) {
			return num1;
		}
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		return gcd;
		
	}
	
	public void gcdEuclidean(int num1,int num2) {
		
		while(num1!=num2) {
			if(num1>num2) {
				num1=num1-num2;
			}
			else {
				num2=num2-num1;
			}
		}
		
		System.out.println(num1);
		
		
	}
	
	public static int gcdRecursion(int num1,int num2) {
		
		if(num1==0) {
			return num2;
		}
		
		if(num2==0) {
			return num1;
		}
		if(num1==num2) {
			return num1;
		}
		if(num1>num2) {
			return gcdRecursion(num1-num2,num2);
		}
		else {
			return gcdRecursion(num1,num2-num1);
		}
	}

	public static void main(String[] args) {
		int num1=50;
		int num2=75;		
		Gcd gcd=new Gcd();
		int result=gcd.findGcd(num1,num2);
		System.out.println(result);
		gcd.gcdEuclidean(num1,num2);
		
		int output=gcdRecursion(num1,num2);
		System.out.println(output);

	}

}
