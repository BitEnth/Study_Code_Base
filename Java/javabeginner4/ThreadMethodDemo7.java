package javabeginner4;

class TdcoTmd7a implements Runnable {
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("the running thread: "+Thread.currentThread().getName()+", i="+i);
			Thread.yield();
		}
	}
}

class TdcoTmd7b implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("the executing thread: "+Thread.currentThread().getName()+", i="+i);
		}
	}
	
}
public class ThreadMethodDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TdcoTmd7a tdc1=new TdcoTmd7a();
		TdcoTmd7b tdc2=new TdcoTmd7b();
		Thread t1=new Thread(tdc1,"Thread--1");
		Thread t2=new Thread(tdc2,"Thread--2");
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
