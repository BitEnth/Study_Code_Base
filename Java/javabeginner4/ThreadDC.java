package javabeginner4;

import java.util.Date;

public class ThreadDC implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=5;i++) {
			System.out.println("the running thread: "+Thread.currentThread().getName()+", i="+i+", time: "+new Date());
			//try {
				//Thread.sleep(1000);
			//}catch(InterruptedException e) {
				//e.printStackTrace();
			//}
		}
	}

}
