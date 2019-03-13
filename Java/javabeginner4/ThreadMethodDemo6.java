package javabeginner4;

class TdcoTmd6 implements Runnable{
	public void run() {
		int i=0;
		while(true) {
			System.out.println("i="+i++);
		}
	}
}
public class ThreadMethodDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TdcoTmd6 tdc=new TdcoTmd6();
		Thread t1=new Thread(tdc,"Thread##1");
		t1.setDaemon(true);
		if(t1.isDaemon()) {
			t1.start();
		}
	}

}
