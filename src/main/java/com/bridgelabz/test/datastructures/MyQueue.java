package com.bridgelabz.test.datastructures;

public class MyQueue {
	private MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void enQueue(INode newNode) {
		myLinkedList.append(newNode);
	}
}
