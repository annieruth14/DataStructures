package com.bridgelabz.test.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
	@Test
	public void given3Numbers_whenAddedToStack_shouldHaveLAstAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, myNode);
	}
	@Test
	public void given3Numbers_whenPoppedStack_shouldMatchWithLastAddedNode() {
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode myNode1 = myStack.pop();
		INode myNode2 = myStack.pop();
		INode myNode3 = myStack.pop();
		Assert.assertEquals(myNode3.getKey() , 70);
	}
}
