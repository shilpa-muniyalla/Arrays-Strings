package com.shil.sample.project;

public class PrintDuplicateOfString {
	
	public static void findPrintDuplicateOfString(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(str.charAt(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		findPrintDuplicateOfString("MYHUBBYISSUPERMANS");
	
	}

}
