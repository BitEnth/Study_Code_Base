package javabeginner5;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class RemindTask1 extends TimerTask{
	public static int number=10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("the time of executing: "+new Date());
		number--;
		while(number<=0) {
			System.out.println("Task ends........");
			System.exit(0);
		}
	}
	
}
public class TimerDemo1 {
	Timer timer;
	public TimerDemo1() {}
	public TimerDemo1(int seconds,int lenTime) {
		timer=new Timer();
		timer.schedule(new RemindTask1(), seconds, lenTime);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Task starts........");
		new TimerDemo1(500,1000);
	}

}
