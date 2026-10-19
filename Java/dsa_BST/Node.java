package dsa_BST;

public class Node {
	int key;
	Node left;
	Node right;
	Node (int key) {
		this.key=key;
	}
	public Node (int key,Node left,Node right) {
		this.key=key;
		this.left=left;
		this.right=right;
	}
}
