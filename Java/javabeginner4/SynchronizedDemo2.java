package javabeginner4;

class TicketoSD2 implements Runnable{
	private int ticket=10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(ticket>=1) {
			this.sale();
		}
	}
	public synchronized void sale() {
		if(ticket>0) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" has sold out Number "+(ticket--)+" ticket.");
		}
	}
}
public class SynchronizedDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketoSD2 window=new TicketoSD2();
		Thread t1=new Thread(window,"the first window");
		Thread t2=new Thread(window,"the second window");
		//t1.start();
		t2.start();
		t1.start();
	}

}
