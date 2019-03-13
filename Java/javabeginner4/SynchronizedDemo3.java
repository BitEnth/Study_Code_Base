package javabeginner4;
import java.util.concurrent.locks.*;

class TicketoSD3 implements Runnable{
	private final ReentrantLock lock=new ReentrantLock();
	private int ticket=10;
	public void run() {
		while(ticket>=1) {
			lock.lock();
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+" has sold out Number "+(ticket--)+" ticket.");
			}
			lock.unlock();
		}
	}
}
public class SynchronizedDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketoSD3 window=new TicketoSD3();
		Thread t1=new Thread(window,"the first window");
		Thread t2=new Thread(window,"the second window");
		t1.start();
		t2.start();
	}

}
