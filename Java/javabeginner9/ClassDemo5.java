package javabeginner9;

public class ClassDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?>c1=null;
		Class<?>c2=null;
		try {
			c1=Class.forName("javabeginner9.SubClass");
			c2=Class.forName("javabeginner9.SuperClass");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("The father class of SubClass: "+c1.getSuperclass().getName());
		System.out.println("The father class of SuperClass: "+c2.getSuperclass().getName());
	}

}
