package javabeginner5;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
	public static double add(double d1,double d2) {
		BigDecimal bd1=new BigDecimal(d1);
		BigDecimal bd2=new BigDecimal(d2);
		return bd1.add(bd2).doubleValue();
	}
	public static double sub(double d1,double d2) {
		BigDecimal bd1=new BigDecimal(d1);
		BigDecimal bd2=new BigDecimal(d2);
		return bd1.subtract(bd2).doubleValue();
	}
	public static double mul(double d1,double d2) {
		BigDecimal bd1=new BigDecimal(d1);
		BigDecimal bd2=new BigDecimal(d2);
		return bd1.multiply(bd2).doubleValue();
	}
	public static double div(double d1,double d2,int len) {
		BigDecimal bd1=new BigDecimal(d1);
		BigDecimal bd2=new BigDecimal(d2);
		return bd1.divide(bd2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	public static double round(double d1,int len) {
		BigDecimal bd1=new BigDecimal(d1);
		BigDecimal bd2=new BigDecimal(1);
		return bd1.divide(bd2, len, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1=1,d2=0.3;
		BigDecimal bd1=new BigDecimal(d1);
		BigDecimal bd2=new BigDecimal(d2*3);
		BigDecimal bd3=bd1.subtract(bd2);
		String result=bd3.toString();
		System.out.println(result);
		System.out.println(d1-d2*3);
		System.out.println(d1*d2);
		System.out.println(round(sub(d1,d2*3),3));
		System.out.println(mul(d1,d2));
	}

}
