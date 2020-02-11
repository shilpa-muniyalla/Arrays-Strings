package com.shil.sample.project;

public class MyStack {
	
	Node top;
	public void push(int a) {
		Node node = new Node(a);
		if(top==null) {
			top=node;
		}
		else {
			Node temp=top;
			top=node;
			top.setPrevious(temp);
			}
	}
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int peek() {
		if(top==null) {
			return -1;
		}
		return top.data;
		
	}
	
	public int pop() {
		if(top==null) {
			return -1;
		}
		else {
			int poppedData=top.data;
			top=top.getPrevious();
			return poppedData;
		}
	}
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
	}

}
