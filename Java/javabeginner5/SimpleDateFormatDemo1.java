package javabeginner5;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SimpleDateFormatDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String format1="yyyy 年 MM 月 dd 日 HH:mm:ss E";
		String format2="yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒 SSS E ";
		SimpleDateFormat sdf1=new SimpleDateFormat(format1);
		SimpleDateFormat sdf2=new SimpleDateFormat(format2);
		Date d1=new Date();
		String date1=sdf1.format(d1);
		String date2=sdf2.format(d1);
		System.out.println(date1);
		System.out.println(date2);
		String strDate="2017-10-22 21:09:45.213";
		String format3="yyyy-MM-dd HH:mm:ss.SSS";
		SimpleDateFormat sdf3=new SimpleDateFormat(format3);
		Date d2=null;
		try {
			d2=sdf3.parse(strDate);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d2);
	}

}
