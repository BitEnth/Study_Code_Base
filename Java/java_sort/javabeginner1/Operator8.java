package javabeginner1;

public class Operator8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6,b=7,max;
		max=a>b?a:b;
		System.out.println("The maximum number is "+max);
		int c=5,d=8;
		byte bt=c>d?((byte)10):8;
		System.out.println("Return byte class: "+bt);
		int i=c>d?10:8;
		System.out.println("Return integer class: "+i);
		long l=c>d?10L:8;
		System.out.println("Return long class: "+l);
		double dou=a>b?10.0:8;
		System.out.println("Return double class: "+dou);
	}

}
