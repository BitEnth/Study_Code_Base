package javabeginner4;

class TicketoSD1 implements Runnable{
	private int ticket=10;
	public void run() {
		while(ticket>=1) {
			synchronized(this) {
				try {
				Thread.sleep(100);
				}catch(InterruptedException e) {
				e.printStackTrace();
				}
				if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+" has sold out Number "+(ticket--)+" ticket.");
				}
			}
		}
	}
}
public class SynchronizedDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketoSD1 window=new TicketoSD1();
		Thread t1=new Thread(window,"the first window");
		Thread t2=new Thread(window,"the second window");
		t1.start();
		t2.start();
	}

}
