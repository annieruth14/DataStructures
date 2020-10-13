package com.bridgelabz.test.datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyBinaryTreeTest<K> {
	MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
	
	@Before
	public void initializeTree() {
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(30);
		myBinaryTree.add(65);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(67);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
	}
	@Test
	public void given3Numbers_whenAddedToBinaryTree_shouldReturnTree() {
		MyBinaryTree<Integer> myBinaryTree1 = new MyBinaryTree<>();
		myBinaryTree1.add(56);
		myBinaryTree1.add(30);
		myBinaryTree1.add(70);
		int size = myBinaryTree1.getSize();
		Assert.assertEquals(3, size);
	}

	@Test
	public void givenNumbers_whenAddedToBinaryTree_shouldReturnTree() {
		int size = myBinaryTree.getSize();
		Assert.assertEquals(13, size);
	}

	@Test
	public void givenNumbers_whenSearchInBinaryTree_shouldReturnNode() {
		K result = (K) myBinaryTree.search(63);
		Assert.assertEquals(result, 63);
	}
}
