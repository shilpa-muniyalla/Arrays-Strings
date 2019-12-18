package com.shil.sample.project;

public class StringReverse {
	public void displayStringReverse(String name) {
		for(int i=name.length()-1; i>=0 ; i--) {
			System.out.println(name.charAt(i));
		}
	}
	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		stringReverse.displayStringReverse("ramya");
	}
		

}
