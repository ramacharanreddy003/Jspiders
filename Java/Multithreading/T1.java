package Multithreading;
public class T1{
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main thread"+i);
		}
		
	}
}