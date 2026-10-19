package DSA;

public class DoubleLinkedList {

		Node1 head;
		int count=0;
		Node1 tail;
	
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public void add(Object ele) {
		Node1 n=new Node1(ele);
		if(head==null) {
			head=n;
			tail=head;
			count++;
			return;
		}
		Node1 temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=n;
		n.prev=temp;
		tail=n;
		count++;
	}
	
	public boolean contains(Object ele) {
		Node1 temp=head;
		while(temp!=null)
			if(temp.ele.equals(ele))
				return true;
		
			temp=temp.next;
		return false;
		
	}
	public void addLast(Object ele) {
		Node1 n= new Node1(ele);
		tail.next=n;
		n.prev=tail;
		tail=n;
		count++;
	}
	public void addFirst(Object ele) {
		Node1 n=new Node1(ele);
		n.next=head;
		head.prev=n;
		head=n;
		count++;
	}
	public void display() {
		Node1 temp=head;
		while(temp!=null) {
			System.out.println(temp.ele);
			temp=temp.next;
		}
	}
	
	public void revDisplay() {
		Node1 temp=tail;
		while(temp!=null)
			System.out.println(temp.ele);
			temp=temp.prev;
	}
	
	
}
