package javabeginner5;

import java.util.Random;

public class RandomDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random1=new Random();
		System.out.println("list random number of  0~0.1: "+random1.nextDouble());
		System.out.println("list random number of 0~10: "+(random1.nextDouble()*10));
		System.out.println("list random number of 5~15: "+(random1.nextInt(10)+5));
		System.out.println("list random number of 0~100: ");
		for(int i=0;i<10;i++) {
			System.out.print(random1.nextInt(100)+" ");
		}
		Random r1=new Random(19);
		Random r2=new Random(11);
		System.out.println();
		System.out.println("the r1 object of Random whose seed is 100: ");
		for(int i=0;i<10;i++) {
			System.out.print(r1.nextInt(100)+" ");
		}
		System.out.println();
		System.out.println("the r2 object of Random whose seed is 100: ");
		for(int j=0;j<10;j++) {
			System.out.print(r2.nextInt(100)+" ");
		}
	}

}
