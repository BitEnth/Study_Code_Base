package javabeginner2;

class Outer3{
	private float f=1.0f;
	private static int x=90;
	public void fun1() {
		class Inner{
			public int i=10;
		}
		class Inner1{
			private float innerF=4.13f;
			public Inner1() {
				System.out.println(f+"+"+innerF+"="+(f+innerF));
			}
		}
		Inner in=new Inner();
		System.out.println(in.i);
		new Inner1();
	}
	public static void fun2() {
		class Inner2{
			private int i=11;
			public Inner2() {
				System.out.println(i+"+"+x+"="+(i+x));
				float temp=new Outer3().f;
				System.out.println(i+"+"+temp+"="+(i+temp));
			}
		}
		new Inner2();
	}
}
class Outer4{
	private int x=90;
	public void fun() {
		int k=40;
		final int y=5;
		class Inner{
			private int x=91;
			private int a=x+k;
			public void getInner() {
				System.out.println("the property of Outer4 class x: "+Outer4.this.x+"\nthe property of Inner x: "+this.x);
				x=k;
				int temp=Outer4.this.x+y+x;
				System.out.println(Outer4.this.x+"+"+y+"+"+x+"="+temp+"\t"+a);
			}
		}
		new Inner().getInner();
	}
}
public class InnerClassDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3 out=new Outer3();
		out.fun1();
		Outer3.fun2();
		Outer4 out1=new Outer4();
		out1.fun();
	}

}
