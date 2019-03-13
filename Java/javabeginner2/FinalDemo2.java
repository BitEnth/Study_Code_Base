package javabeginner2;

class Base1{
	public final void add(int x,int y) {
		System.out.println("x+y="+(x+y));
	}
}
class Subclassing1 extends Base1{
	public final void add(int x,int y,int z) {
		System.out.println("x+y+z="+(x+y+z));
	}
}
public class FinalDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclassing1 sub1=new Subclassing1();
		sub1.add(12, 89);
		sub1.add(14, 23, 90);
	}

}
