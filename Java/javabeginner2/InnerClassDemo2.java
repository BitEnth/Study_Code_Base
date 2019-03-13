package javabeginner2;

class Outer1{
	int i=19;
	public class Inner{
		int i=20;
		public void add(int x,int y) {
			System.out.println(x+"+"+y+"="+(x+y));
		}
		public void mul(int x,int y) {
			System.out.println(x+"¡Á"+y+"="+(x*y));
		}
		public void getOuterI() {
			System.out.println("i is on behalf of the member of Innner class i: "+i);
			System.out.println("this.i is representative of the member of Inner class i: "+this.i);
			System.out.println("Inner.this.i is on behalf of the member of Inner class i: "+Inner.this.i);
			System.out.println("Outer1.this.i is on behalf of the member of Outer1 class i: "+Outer1.this.i);
		}
	}
	public void getAdd() {
		Inner in=new Inner();
		in.add(4, 8);
		in.mul(7, 9);
	}
	public static void getMul() {
		Inner staticin=new Outer1().new Inner();
		staticin.add(5, 9);
		staticin.mul(8, 6);
	}
}
class InnerClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 out=new Outer1();
		out.getAdd();
		Outer1.getMul();
		Outer1.Inner oin=new Outer1().new Inner();
		oin.add(10, 10);
		oin.mul(7, 9);
		oin.getOuterI();
	}

}
