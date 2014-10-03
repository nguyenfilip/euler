package net.nguyen;

public class Node {
	private Node leftChild;
	private Node rightChild;
	private int value;
	
	public Node(Node leftChild, Node rightChild, int value) {
		super();
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.value = value;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public int getValue() {
		return value;
	}
	
	
}
