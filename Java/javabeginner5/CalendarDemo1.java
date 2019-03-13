package javabeginner5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal1=new GregorianCalendar();
		Calendar cal2=Calendar.getInstance();
		System.out.println("Year: "+cal2.get(1));
		System.out.println(Calendar.MONTH);
		System.out.println("Month: "+(cal2.get(Calendar.MONTH)+1));
		System.out.println("Day: "+cal2.get(Calendar.DATE));
		System.out.println("Number "+cal2.get(Calendar.DAY_OF_YEAR)+" day of this year.");
		System.out.println("Number "+cal2.get(Calendar.DAY_OF_MONTH)+" day of this month.");
		System.out.println("Number "+cal2.get(Calendar.DAY_OF_WEEK_IN_MONTH)+" week of this month.");
		System.out.println("Number "+(cal2.get(Calendar.DAY_OF_WEEK)+6)+" day of this week.");
		System.out.println("Hour: "+cal2.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hour: "+cal2.get(Calendar.HOUR));
		System.out.println("Minute: "+cal2.get(Calendar.MINUTE));
		System.out.println("Second: "+cal2.get(Calendar.SECOND));
		System.out.println("Minminute: "+cal2.getTimeInMillis()+" "+cal2.get(Calendar.MILLISECOND));
		System.out.println("Date: "+cal2.getTime());
		cal1.set(2017,10,22,10,0,0);
		long time=cal1.getTimeInMillis()-cal2.getTimeInMillis();
		long day=time/(24*3600*1000);
		System.out.println(day);
	}

}
