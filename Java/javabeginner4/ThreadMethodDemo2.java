package javabeginner4;

public class ThreadMethodDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDC tc=new ThreadDC();
		Thread t1=new Thread(tc,"Thread@1");
		Thread t2=new Thread(tc,"Thread#2");
		Thread t3=new Thread(tc,"Thread$3");
		Thread t4=new Thread(tc,"Thread%4");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(2);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
