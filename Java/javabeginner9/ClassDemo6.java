package javabeginner9;

import java.lang.reflect.Field;

public class ClassDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?>c1=null;
		try {
			c1=Class.forName("javabeginner9.LocaderClass");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		Field field[]=c1.getDeclaredFields();
		for(int i=0;i<field.length;i++) {
			System.out.println("+++++++++++++++++++");
			field[i].setAccessible(true);
			System.out.println("the name of the property of member: "+field[i].getName());
			System.out.println("the type of the property of member: "+field[i].getType());
			try {
				System.out.println("the content of the property of member: "+field[i].get(c1.newInstance()));
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
