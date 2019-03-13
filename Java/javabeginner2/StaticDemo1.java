package javabeginner2;

public class StaticDemo1 {
	public static int ticket=10;
	public void sell() {
		ticket--;
		System.out.println("left: "+ticket);
	}
	public static void left() {
		int i=ticket-2;
		System.out.println("still left: "+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=ticket--;
		System.out.println("x="+x+" ticket="+ticket);
		int y=StaticDemo1.ticket--;
		System.out.println("y="+y+" ticket="+ticket);
		StaticDemo1 st1=new StaticDemo1();
		int k=st1.ticket--;
		System.out.println("k="+k+" ticket="+ticket);
		StaticDemo1 st2=new StaticDemo1();
		st2.sell();
		left();
	}

}
