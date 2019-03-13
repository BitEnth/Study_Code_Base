package javabeginner4;

public class MainThread implements Runnable{
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("the running thread: "+Thread.currentThread()+", i="+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mt=Thread.currentThread();
		System.out.println("the information of the thread: "+mt);
		System.out.println("the name of the thread: "+mt.getName());
		mt.setName("the main thread");
		System.out.println("the name of the thread: "+mt.getName());
		MainThread mThread=new MainThread();
		Thread t=new Thread(mThread);
		t.start();
		mThread.run();
	}

}
