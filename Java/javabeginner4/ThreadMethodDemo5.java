package javabeginner4;

import java.util.Date;

class TDCOTMD5 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("the time of starting run method:  "+new Date());
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println("the thread is awake");
		}
		System.out.println("the time of terminating the run() method: "+new Date());
	}
}
public class ThreadMethodDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TDCOTMD5 tdc=new TDCOTMD5();
		Thread t1=new Thread(tdc,"Thread--1");
		t1.start();
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		t1.interrupt();
	}

}
