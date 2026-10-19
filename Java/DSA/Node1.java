package DSA;

public class Node1 {
						//DLL
		Object ele;
		Node1 next;
		Node1 prev;
		
		Node1(Object ele){
			this.ele=ele;
			
		}
		public Node1(Object ele,Node1 next,Node1 prev) {
			this.ele=ele;
			this.next=next;
			this.prev=prev;
		}
	
}
