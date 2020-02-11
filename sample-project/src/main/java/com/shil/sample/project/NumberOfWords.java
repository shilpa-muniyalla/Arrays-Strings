package com.shil.sample.project;

import java.util.HashMap;
import java.util.Map;

public class NumberOfWords {
	
	public static void checkNumberOfWords(String x) {
		
		String[] y=x.split(" ");
	
		System.out.println(y.length);
	}

	public static void main(String[] args) {
		NumberOfWords.checkNumberOfWords("We are in santa clara county and country california");

	}

}

/*public class NumberOfWords {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "we are");
		map.put(2,"are");
		map.put(3,"in");
		map.put(4, "california");
		
	System.out.println(map.size());
		
	}
}*/
