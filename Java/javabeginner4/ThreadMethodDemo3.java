package javabeginner4;

public class ThreadMethodDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDC tc=new ThreadDC();
		Thread t1=new Thread(tc,"Thread&1");
		Thread t2=new Thread(tc,"Thread*2");
		Thread t3=new Thread(tc,"Thread+3");
		t1.start();
		t2.start();
		t3.start();
	}

}
