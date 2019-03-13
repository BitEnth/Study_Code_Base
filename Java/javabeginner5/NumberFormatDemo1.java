package javabeginner5;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long L1=100000000L;
		double d1=1234567.089;
		System.out.println("---Defualt Format(Chinese)---");
		NumberFormat nfm1=NumberFormat.getInstance();
		NumberFormat nfm4=NumberFormat.getPercentInstance();
		System.out.println(nfm1.format(L1));
		System.out.println(nfm1.format(d1));
		System.out.println(nfm4.format(0.12812));
		System.out.println("---Default Format(Germany)---");
		NumberFormat nfm2=NumberFormat.getNumberInstance(Locale.GERMAN);
		System.out.println(nfm2.format(L1));
		System.out.println(nfm2.format(d1));
		System.out.println("---American---");
		NumberFormat nfm3=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nfm3.format(L1));
		System.out.println(nfm3.format(d1));
	}

}
