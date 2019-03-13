package javabeginner5;

import java.math.BigInteger;

public class BigIntegerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1="123456789123456789";
		String strNum2="987654321987654321";
		BigInteger big1=new BigInteger(strNum1);
		BigInteger big2=new BigInteger(strNum2);
		System.out.println("ADD: "+big1.add(big2));
		System.out.println("SUBTRACT: "+big2.subtract(big1));
		System.out.println("MUTIPLUS: "+big1.multiply(big2));
		System.out.println("DIVIDE: "+big2.divide(big1));
		System.out.println("MOD: "+big2.mod(big1));
		System.out.println("MAXCOMMONNUMBER: "+big2.gcd(big1));
		System.out.println("MAXIMUM: "+big1.max(big2));
		System.out.println("MINMUIM: "+big2.min(big1));
		byte b[]=big1.toByteArray();
		System.out.println("the complement code: ");
		for(byte i:b) {
			System.out.print(i+" ");
		}
	}

}
