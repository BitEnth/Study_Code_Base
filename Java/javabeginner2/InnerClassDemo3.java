package javabeginner2;

import javabeginner2.Outer2.Inner;

class Outer2{
	private int a=4;
	private static int b=5;
	public static class Inner{
		private int x=5;
		private static int y=6;
		public void add() {
			int temp=new Outer2().a;
			System.out.println(temp+"+"+x+"="+(temp+x));
		}
		public static void mul() {
			System.out.println(b+"¡Á"+y+"="+(b*y));
		}
	}
	public void getInfo() {
		new Inner().add();
		Inner.mul();
	}
}
public class InnerClassDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out=new Outer2();
		out.getInfo();
		Outer2.Inner in=new Outer2.Inner();
		in.add();
		Inner.mul();
	}

}
