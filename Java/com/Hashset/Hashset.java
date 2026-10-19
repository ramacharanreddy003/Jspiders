

package com.Hashset;

public class Hashset {
	Node[] a = new Node[10];
	int count = 0;

	public boolean add(Object ele) {
		Node n= new Node(ele);
		int index = Math.abs(ele.hashCode() % a.length);
		if (a[index] == null) {
			a[index] = n;
			count++;
			return true;
		}
		Node curr = a[index];
		while (curr != null) {
			if (curr.ele.equals(ele)) {
				return false;
			}
			curr = curr.next;
		}
		curr = a[index];
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(ele);
		count++;
		return true;
	}
	 public int size() {
	        return count;
	    }

	public boolean isEmpty() {
		return count == 0;
	}
	
	
	public boolean contains(Object ele) {
		 int index = Math.abs(ele.hashCode() % a.length);

		Node curr=a[index];
		while(curr!=null)
		{
			if(curr.ele.equals(ele))
				return true;
				curr=curr.next;
		}
		return false;
		}	
		
	public boolean set(Object ele) {
		int index=Math.abs(ele.hashCode()%a.length);
		Node curr=a[index];
		while(curr!=null) {
			if(curr.ele.equals(ele)) {
				curr.ele=ele;
				return true;
			}
			curr=curr.next;
		}
		return false;
	}
	
	public boolean remove(Object ele) {
		int index=Math.abs(ele.hashCode()%a.length);
		Node curr=a[index];
		Node prev=null;
		while(curr!=null)
			if(curr.ele.equals(ele)) {
				if(prev==null)
					a[index]=curr.next;
				count--;
				return true;
			}
		prev.next=prev.next.next;
		count--;
		return false;
	
		
	}
	
	public void display() {
		for (int i = 0; i < a.length; i++) {
			Node curr = a[i];
			while (curr != null) {
				System.out.println(curr.ele);
				curr = curr.next;
			}
		}
	}
}