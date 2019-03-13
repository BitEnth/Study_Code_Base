package javabeginner4;

import java.util.Date;

public class ThreadMethodDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDC tc=new ThreadDC();
		Thread t1=new Thread(tc,"Thread!!!1");
		t1.start();
		for(int i=0;i<10;i++) {
			if(i==5) {
				try {
					//t1.start();
					t1.join();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("main="+i+"---->"+new Date());
		}
	}

}
