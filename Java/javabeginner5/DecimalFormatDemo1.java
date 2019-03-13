package javabeginner5;

import java.text.DecimalFormat;

public class DecimalFormatDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double d1=123456.789;
		DecimalFormat dfm1=new DecimalFormat("000,000.000");
		System.out.println(dfm1.format(d1));
		DecimalFormat dfm2=new DecimalFormat("☺###,###.###");
		System.out.println(dfm2.format(d1));
	}

}
