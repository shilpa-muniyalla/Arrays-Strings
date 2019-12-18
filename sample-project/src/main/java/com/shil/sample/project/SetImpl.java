package com.shil.sample.project;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetImpl {
	
	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		set.add("ramya");
		set.add("shilpa");
		set.add("praveen");
		set.add("mithun");
		
		Iterator<String> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String s:set) {
			System.out.println(s);
			
			
		}
		
		System.out.println(set.contains("girish"));
		
		
	}

}
