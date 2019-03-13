package javabeginner6;

class Generics{
	private Object obj;
	public void setObj(Object obj) {
		this.obj=obj;
	}
	public Object getObj() {
		return obj;
	}
}
public class GenericsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics gd=new Generics();
		gd.setObj(new Integer(5));
		Integer in=(Integer)gd.getObj();
		System.out.println("The setting number: "+in);
		//gd.setObj("1.23");
		gd.setObj(1.23f);
		Float f=(Float)gd.getObj();
		System.out.println("The setting number: "+f);
	}

}
