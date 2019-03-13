package javabeginner9;

class SubClass extends SuperClass{
	public void show() {
		System.out.println("This is show method of SubClass");
	}
}
public class ObjectClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass sup=new SuperClass();
		SubClass sub=new SubClass();
		Class<? extends SuperClass> c1=sup.getClass();
		Class<? extends SubClass> c2=sub.getClass();
		System.out.println("Name of class: "+c1.getName());
		System.out.println("Name of class: "+c2.getName());
	}

}
