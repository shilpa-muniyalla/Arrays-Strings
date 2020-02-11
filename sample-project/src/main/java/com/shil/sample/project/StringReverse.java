package com.shil.sample.project;

public class StringReverse {
	public String displayStringReverse(String name) {
		String temp="";
		for(int i=name.length()-1; i>=0 ; i--) {
			temp=temp+name.charAt(i);
		}
		return temp;
	}
	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		System.out.print(stringReverse.displayStringReverse("ramya"));
	}
		

}
