package com.bridgelabz.test.datastructures;

public class MyQueue {
	private MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void enQueue(INode newNode) {
		myLinkedList.append(newNode);
	}

	public void printQueue() {
		myLinkedList.printMyNodes();
	}

	public INode deQueue() {
		return myLinkedList.pop();
	}
}
