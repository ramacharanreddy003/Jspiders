package Multithreading;

public class Test2 {

	public static void main(String[] args) {
		
		T t1 = new T();
		//t1.start();
		Thread t = new Thread(t1);
		t.start();
	}

}
