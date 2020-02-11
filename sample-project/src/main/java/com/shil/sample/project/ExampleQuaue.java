package com.shil.sample.project;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ExampleQuaue {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for(int i=0;i<list.size();i++) {
		
		System.out.println(list.get(i));
		
		
	}
		
		Iterator i=list.iterator();
		while(i.hasNext()) {
			
			
			System.out.println(i.next());
			
		}
		
		for(Integer n:list) {
			
			System.out.println(n);
			
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		   q.add(1);
		   q.add(2);
		   q.add(3);
		   q.add(4);
		   
		   System.out.println(q.poll());
		   System.out.println(q.peek());
		   System.out.println(q.poll());
		   
		
		

}
}
