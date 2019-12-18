package com.shil.sample.project;

public class StringReverseRecursion {
	
	public static String findStringReverseRecursion(String str) {
		
		if((null==str) || (str.length()<=1)){
			return  str;
			
		}
		
	return	findStringReverseRecursion(str.substring(1)) + str.charAt(0); 
		
	}

	public static void main(String[] args) {
		
		String s=findStringReverseRecursion("MyJAVA");
		System.out.println(s);
	}

}
