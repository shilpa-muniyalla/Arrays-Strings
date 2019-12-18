package com.shil.sample.project;

import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("A");
		s.push("B");
		s.push("c");
		
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		System.out.println(s.empty());
	}

}
