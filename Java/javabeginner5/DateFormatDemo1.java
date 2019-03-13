package javabeginner5;

import java.util.Date;
import java.text.DateFormat;

public class DateFormatDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df1=DateFormat.getInstance();
		DateFormat df2=DateFormat.getDateInstance();
		DateFormat df3=DateFormat.getDateTimeInstance();
		DateFormat df4=DateFormat.getTimeInstance();
		Date d1=new Date();
		DateFormat df5=DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL);
		System.out.println("Defualt: "+df1.format(d1));
		System.out.println("Date defualt: "+df2.format(d1));
		System.out.println("Time defualt: "+df4.format(d1));
		System.out.println("DateTime defualt: "+df3.format(d1));
		System.out.println(df5.format(d1));
		System.out.println(DateFormat.SHORT);
	}

}
