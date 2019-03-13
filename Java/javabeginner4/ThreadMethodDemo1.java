package javabeginner4;

class ThreadDemo3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("the running thread: "+Thread.currentThread().getName()+", i="+i+" the number of the active threads: "+Thread.activeCount());
		}
	}
	
}
public class ThreadMethodDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo3 tm=new ThreadDemo3();
		Thread t1=new Thread(tm);
		Thread t2=new Thread(tm,"Thread***1");
		Thread t3=new Thread(tm);
		t3.setName("Thread###2");
		System.out.println("the number of active thread: "+Thread.activeCount());
		t1.start();
		t2.start();
		t3.start();
	}

}
