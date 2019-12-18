package com.shil.sample.project;

import java.util.HashMap;


public class OccurenceOfEachCharacterInString {
	
	public static void checkOccurenceOfEachCharacterInString(String s) {
		s.toLowerCase();
		s.replaceAll("\\s+", "");
		char[] array =s.toCharArray();
		
		HashMap<Character,Integer> hashmap=new HashMap<>();
		
		for(char c:array) {
		if(hashmap.containsKey(c)) {
			hashmap.put(c,hashmap.get(c)+1);
		}
		
		else {
			hashmap.put(c, 1);
		}
	}
		System.out.println(s +" "+hashmap);
	}

	public static void main(String[] args) {
		checkOccurenceOfEachCharacterInString("My Java is JVM");
		

	}

}
