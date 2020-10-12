package com.bridgelabz.test.datastructures;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	public MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	public int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	public K search(K key) {
		return this.searchRecursively(root, key);
	}

	public K searchRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return null;
		int compareResult = key.compareTo(current.key);
		// System.out.println(compareResult);
		if (current.equals(key))
			return key;
		if (compareResult < 0)
			this.searchRecursively(current.left, key);
		if (compareResult > 0)
			this.searchRecursively(current.right, key);
		return key;

	}
}
