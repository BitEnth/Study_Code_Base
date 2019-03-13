package javabeginner1;
import java.math.BigDecimal;
public class Rigorous1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float d=10.00f;
		float f=9.30f;
		System.out.println("Undealt:\t"+(d-f));
		BigDecimal d1=new BigDecimal("10.00");
		BigDecimal f1=new BigDecimal("9.30");
		BigDecimal sub=d1.subtract(f1);
		double ret=sub.doubleValue();
		System.out.println("Use BigDecimal Class:\t"+ret);
		long dl=(long)(d*100);
		long fl=(long)(f*100);
		double ret1=(dl-fl)/100.0;
		System.out.println("Switch to long:\t"+ret1);
		long L1=2147283640*10;
		long L2=2147283640L*10;
		System.out.println("L1="+L1+"\tL2="+L2);
	}

}
