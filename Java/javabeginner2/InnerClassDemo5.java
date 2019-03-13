package javabeginner2;

abstract class AbstrClass1{
	public abstract void getInfo();
}
interface Interf1{
	public abstract void getInfo();
}
class Inter{
	private int t=188;
	public void printAbs() {
		showAbs(new AbstrClass1() {
			public void getInfo() {
				System.out.println("Java note: AbstractClass");
			}
		});
	}
	public void printInf() {
		int y=90;
		final int f1=78;
		showInterf(new Interf1() {
			int x;
			int temp=t;
			{
				x=10;
			}
			public void getInfo() {
				System.out.println("Java note: Interface"+"and x="+x+" y="+y+" t="+temp+" f1="+f1);
			}
		});
	}
	public void showAbs(AbstrClass1 a) {
		a.getInfo();
	}
	public void showInterf(Interf1 i) {
		i.getInfo();
	}
}
public class InnerClassDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter in1=new Inter();
		in1.printAbs();
		in1.printInf();
	}

}
