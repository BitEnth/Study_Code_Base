package javabeginner9;

public class ClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> c1=null;
		try {
			c1=Class.forName("javabeginner9.LocaderClass");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("The name of Class: "+c1.getName());
		Class<LocaderClass> c2=LocaderClass.class;
		System.out.println("The name of class: "+c2.getName());
	}

}
