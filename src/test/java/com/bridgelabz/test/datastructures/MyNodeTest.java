package com.bridgelabz.test.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
	MyNode myNode = null;

	@Test
	public void givenNumbers_whenCreateLinkedList_ShouldReturnTrue() {
		MyNode<Integer> myFirst = new MyNode<>(56);
		MyNode<Integer> mySecond = new MyNode<>(30);
		MyNode<Integer> myThird = new MyNode<>(70);
		myFirst.setNext(mySecond);
		mySecond.setNext(myThird);
		boolean result = myFirst.getNext().equals(mySecond) && myFirst.getNext().getNext().equals(myThird);
		Assert.assertTrue(result);
	}

}
