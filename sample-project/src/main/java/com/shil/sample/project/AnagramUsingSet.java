package com.shil.sample.project;

import java.util.HashSet;
import java.util.Set;

public class AnagramUsingSet {
	
	public static void findAnagramUsingSet(String str1,String str2) {
		Set<Character> set = new HashSet();
		char[] array1=str1.toCharArray();
		char[] array2=str2.toCharArray();
		
		boolean value=true;
		
		if(array1.length==array2.length) {
			for(int i=0;i<array1.length;i++) {
				set.add(array1[i]);
			}
		
		
			for(int i=0;i<array2.length;i++) {
				if(!set.contains(array2[i])){
					value=false;
					break;	
				}
			}
		}
		else {
			value=false;
		}
		
		if(value==false) {
		System.out.println("its not an anagram");
		}
		if(value==true) {
			System.out.println("its an anagram");
		}
			
	}

	public static void main(String[] args) {
		findAnagramUsingSet("MARY","SHILP");
		

	}

}
