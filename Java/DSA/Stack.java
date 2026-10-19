package DSA;

public class Stack {

	Node first;
	int count=0;
	public void push(Object ele) {
		Node n= new Node(ele);
		if(first==null) {
			first=n;
			count++;
			return;
		}
		n.next=first;
		first=n;
		count++;
	}
	public Object pop() {
		Object key=first.ele;
		
	}

}
