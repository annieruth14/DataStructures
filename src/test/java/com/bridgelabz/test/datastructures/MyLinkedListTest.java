package com.bridgelabz.test.datastructures;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void givenNumbers_WhenAddedToLinkedList_shouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		// myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenNumbers_WhenAppendToLinkedList_shouldBeAppendedToLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		// myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenNumbers_WhenInsertInLinkedList_shouldBeInserted() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		// myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void givenNumbers_WhenPoppedFromALinkedList_shouldReturnHead() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		// myLinkedList.printMyNodes();
		INode popped = myLinkedList.pop();
		//myLinkedList.printMyNodes();
		Assert.assertEquals(56, popped.getKey());
	}

	@Test
	public void givenNumbers_WhenPoppedFromEndOfLinkedList_shouldReturnTail() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		// myLinkedList.printMyNodes();
		INode popped = myLinkedList.popLast();
		//myLinkedList.printMyNodes();
		Assert.assertEquals(70, popped.getKey());
	}

	@Test
	public void givenNumbers_WhenFindTheGivenKey_shouldReturnTrue() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		Boolean searchResult = myLinkedList.search(mySecondNode.getKey());
		Assert.assertTrue(searchResult);
	}

	@Test
	public void givenNumbers_WhenFindTheGivenKey_shouldInsertTheNewKey() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myFourthNode);
		//myLinkedList.printMyNodes();
		Boolean result = myLinkedList.insertAfter(mySecondNode.getKey(), myThirdNode);
		boolean Rresult = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.head.getNext().getNext().equals(myThirdNode) && myLinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(Rresult);
	}
	@Test
	public void givenNumbers_WhenFindTheGivenKey_shouldDeleteKey() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myFourthNode);
		int sizeOfList = myLinkedList.delete(mySecondNode);
		System.out.println(sizeOfList);
		Assert.assertEquals(sizeOfList, 3);
	}
}
