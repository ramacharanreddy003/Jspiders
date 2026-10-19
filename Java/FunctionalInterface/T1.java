package FunctionalInterface;
interface Runable{
	void run();
}
class T1 implements Runable{
	
	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.println("T1 "+i);
//		}
		T1 t1 = new T1();
		t1.start();
		
	}
}