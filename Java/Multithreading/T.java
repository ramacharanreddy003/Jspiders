package Multithreading;

public class T implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("T1 thread: "+i);
		}
	}
}
