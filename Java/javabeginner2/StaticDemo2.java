package javabeginner2;

public class StaticDemo2 {
	public static int piece=10;
	int count=0;
	public void number() {
		piece--;
		count++;
		System.out.println("1. unstatic method number: piece="+piece+" count="+count);
	}
	public void time() {
		System.out.println("2. unstatic method number: piece="+piece+" count="+count);
		System.out.println("\ntime-number: ");
		number();
		System.out.println("\ntime-amount: ");
		amount();
	}
	public static void amount() {
		piece--;
		System.out.println("3.static-amount: piece="+piece);
	}
	public static void figure() {
		piece--;
		System.out.println("4.static-figure: piece="+piece);
		System.out.println("\nfigure-amount: ");
		amount();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amount();
		StaticDemo2.figure();
		StaticDemo2 st2=new StaticDemo2();
		st2.number();
		st2.time();
		st2.amount();
	}

}
