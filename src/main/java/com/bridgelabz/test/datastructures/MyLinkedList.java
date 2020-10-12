package com.bridgelabz.test.datastructures;

public class MyLinkedList<K> {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// Prints the nodes
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!(tempNode.equals(tail)))
				myNodes.append(" --> ");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	// Adds a new node to the linked list
	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	// Appending a new node to linked list
	public void append(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	// Insert a node between given two nodes ie. Node after which you want to insert
	// and the new node
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	// Pop a value from the head
	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	// Pop a value from tail
	public INode popLast() {
		INode tempNode = head;
		while (tempNode.getNext() != tail) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}
	
	public boolean remove(K Key) {
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getNext().getKey().equals(Key)) {
				tempNode.setNext(tempNode.getNext().getNext());
				return true;
			}
		}
		return false;
	}

	public INode<K> search(K Key) {
		INode<K> tempNode = head;
		while(tempNode != null) {
			if (tempNode.getKey().equals(Key)) {
				return tempNode ;
			}
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	public <K> boolean insertAfter(K Key, INode newNode) {
		INode tempNode = head;
		while (tempNode.getKey() != Key) {
			tempNode = tempNode.getNext();
		}
		if (tempNode.getKey() == Key) {
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);
			return true;
		}
		else
			return false;
	}

	public int delete(INode myNode) {
		INode tempNode = head;
		while(tempNode != null && tempNode.getNext() != myNode) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(tempNode.getNext().getNext());
		int sizeOfList = size();
		return sizeOfList;
	}

	public int size() {
		INode tempNode = head;
		int counter = 0;
		while (tempNode != null) {
			tempNode = tempNode.getNext();
			counter ++;
		}
		return counter;
	}
	@Override
	public String toString() {
		return "MyLinkedListNodes{" + head + '}';
	}
}	
