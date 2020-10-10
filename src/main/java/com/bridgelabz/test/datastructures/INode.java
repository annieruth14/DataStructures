package com.bridgelabz.test.datastructures;

public interface INode<T> {
	T getKey();
	void setKey(T key);
	
	INode getNext();
	void setNext(INode next);
}
