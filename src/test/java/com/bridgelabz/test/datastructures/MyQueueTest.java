package com.bridgelabz.test.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
	@Test
	public void given3Numbers_whenAddedToQueue_shouldHaveLAstAddedNode() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myQueue.enQueue(myFirstNode);
		myQueue.enQueue(mySecondNode);
		myQueue.enQueue(myThirdNode);
		myQueue.printQueue();
	}
	@Test
	public void given3Numbers_whenDeQueue_shouldReturnTheFirstNode() {
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myQueue.enQueue(myFirstNode);
		myQueue.enQueue(mySecondNode);
		myQueue.enQueue(myThirdNode);
		INode poppedNode = myQueue.deQueue();
		myQueue.printQueue();
		Assert.assertEquals(poppedNode.getKey(), 56);
	}
}
