package javabeginner9;

import java.lang.reflect.Constructor;

public class ClassDemo3 {
	
	public static void printst1(Student1 stu1) {
		System.out.println("The information of object: "+stu1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?>c1=null;
		Student1 stu1=null;
		Student1 stu2=null;
		Student1 stu3=null;
		Student1 stu4=null;
		Constructor<?>con[]=null;
		try {
			c1=Class.forName("javabeginner9.Student1");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		con=c1.getConstructors();
		/*
		 * Print with order of stack
		 */
		for(int i=0;i<con.length;i++) {
			System.out.println(i+"------"+con[i]);
		}
		try {
			stu1=(Student1)con[0].newInstance("Tonn",23);
			stu2=(Student1)con[1].newInstance(24);
			stu3=(Student1)con[2].newInstance("Yoyo");
			stu4=(Student1)con[3].newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		printst1(stu1);
		printst1(stu2);
		printst1(stu3);
		printst1(stu4);
	}

}
