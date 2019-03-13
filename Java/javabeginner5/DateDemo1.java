package javabeginner5;

import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis()+123L);
		System.out.println("Time now: "+date1);
		System.out.println("Time difference: "+date2.getTime()+" ms");
		System.out.println("Whether date1 is the same as date2: "+date1.compareTo(date2));
		System.out.println("Whether date2 is the same as date1: "+date2.compareTo(date1));
		System.out.println("Whether date1 is the same as date1: "+date1.compareTo(date1));
		System.out.println("whether date1 is earlier than date2: "+date1.before(date2));
	}

}
