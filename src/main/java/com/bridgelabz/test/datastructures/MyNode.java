package com.bridgelabz.test.datastructures;

public class MyNode<T>  implements INode<T> {
	private T key;
	private INode next;

	public MyNode(T key) {
		super();
		this.key = key;
		// this.next = next;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = next;
	}
}
