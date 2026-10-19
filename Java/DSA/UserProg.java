package DSA;

public class UserProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.addFirst(1);
		l.addLast(55);
		l.addIndex(100, 0);
		l.addIndex(1, 1);
		l.set(122,3);
		l.contains(1);
		l.removeFirst();
		System.out.println("size: "+l.size());
		l.display();
		
		

	}

}
