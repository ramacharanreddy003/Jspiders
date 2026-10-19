package DSA.BinarySearchTree;

public class BinarySearchTree {
	Node root;
	int count=0;
	boolean flag;
	public boolean add(int key) {
		flag=true;
		root=add(root,key);
		return flag;
	}
	public Node add(Node n,int key) {
		if(n==null) {
			n=new Node(key);
			count++;
			return n;
		}
	}
}
