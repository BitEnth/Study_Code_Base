package javabeginner4;

class Ticket2 implements Runnable{
	private int ticket=10;
	public Ticket2() {}
	public void run() {
		while(ticket>0) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+" has sold out Number "+(ticket--)+" ticket......");
			}
		}
	}
}
public class RunnableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket2 window=new Ticket2();
		Thread t1=new Thread(window,"the first window");
		Thread t2=new Thread(window,"the second window");
		t1.start();
		t2.start();
	}

}
