//to check both words are same

package com.shil.sample.project;

import java.util.Arrays;

public class Anagram {
	
	public static boolean findAnagram(String str1,String str2) {
		char[] array1=str1.toCharArray();
		char[] array2=str2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]!=array2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(findAnagram("shilpa","aplihs"));

	}

}
