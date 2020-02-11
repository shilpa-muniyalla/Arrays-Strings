package com.shil.sample.project;

public class Node {
	
	int data;
	private Node previous;
	
	public void setPrevious(Node previous) {
		this.previous=previous;
	}
	
	public Node getPrevious() {
		return previous;
	}
	
	Node(int data){
		this.data=data;
	}

}
