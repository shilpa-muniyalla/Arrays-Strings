package com.shil.sample.project;

public class RemoveWhiteSpaceFromString {
	
	public static String findRemoveWhiteSpaceFromString(String str) {
		String[] array=str.split("\\s");
	String s="";
	for(int i=0;i<array.length;i++) {
		s=s+array[i];
		}
	
	return s;
	
	}

		/*char[] c=str.toCharArray();
		String s="";
		for(int i=0;i<c.length;i++) {
			s=s+c[i];
		}
		System.out.println(s);
	}*/
	public static void main(String[] args) {
		String word=findRemoveWhiteSpaceFromString("my name is shilpa");
		System.out.println(word);
		
	}

}
