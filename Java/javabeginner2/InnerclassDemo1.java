package javabeginner2;

class Outer{
	private String str="Java note";
	public class Inner{
		public void add(int x,int y) {
			System.out.println(x+"+"+y+"="+(x+y));
		}
		public void getStr() {
			System.out.println(str);
		}
	}
	public void getInfo() {
		new Inner().getStr();
	}
}
public class InnerclassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out=new Outer();
		out.getInfo();
		Outer.Inner oin=new Outer().new Inner();
		oin.add(3, 5);
		oin.getStr();
	}

}
