package Multithreading;

public class Test1 extends Thread{

	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("T2-Thread: "+i);
		}
	}
}
