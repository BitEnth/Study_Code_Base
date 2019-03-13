package javabeginner9;

import java.lang.reflect.Field;

public class ClassDemo7 {
	public static final void print1() {
		System.out.print("After modified the content of member: ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?>c=null;
		LocaderClass lclass=null;
		System.out.println("*****the primary information of lclass*****");
		
		try {
			c=Class.forName("javabeginner9.LocaderClass");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			lclass=(LocaderClass)c.newInstance();
			System.out.println(lclass);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Field field[]=c.getDeclaredFields();
		for(int i=0;i<field.length;i++) {
			field[i].setAccessible(true);
			Class<?>fieldType=field[i].getType();
			System.out.println("！！！！！！！！！！！！！！！！！！！！！！！");
			System.out.println("the name of the property of member: "+field[i].getName());
			System.out.println("the type of the property of member: "+fieldType);
			try {
				System.out.println("the content of the property of member: "+field[i].get(lclass));
				if(fieldType.equals(int.class)) {
					print1();
					field[i].set(lclass, 500);
					System.out.println(field[i].get(lclass));
				}else if(fieldType.equals(boolean.class)) {
					print1();
					field[i].set(lclass, false);
					System.out.println(field[i].get(lclass));
				}else if(fieldType.equals(long.class)) {
					print1();
					field[i].set(lclass, 7182391L);
					System.out.println(field[i].get(lclass));
				}else if(fieldType.equals(String.class)) {
					print1();
					field[i].set(lclass, "JAVA NOTE");
					System.out.println(field[i].get(lclass));
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("*****After modified the information of lclass*****");
		System.out.println(lclass);
		LocaderClass lclass2=new LocaderClass();
		System.out.println(lclass2);
	}

}
