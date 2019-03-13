package javabeginner4;

class Ticket1 extends Thread{
	private static int ticket=10;
	public Ticket1() {}
	public Ticket1(String name) {
		setName(name);
	}
	public void run() {
		while(ticket>0) {
			if(ticket>0) {
				System.out.println(Thread.currentThread().getName()+" sell out Number "+(ticket--)+" ticket");
			}
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket1 window1=new Ticket1("the first window");
		Ticket1 window2=new Ticket1("the second window");
		window1.start();
		window2.start();
	}

}
