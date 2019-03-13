package javabeginner9;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassDemo9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?>c=null;
		LocaderClass lclass=null;
		try {
			c=Class.forName("javabeginner9.LocaderClass");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			lclass=(LocaderClass)c.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		Method mt[]=c.getDeclaredMethods();
		for(int i=0;i<mt.length;i++) {
			mt[i].setAccessible(true);
			System.out.println("！！！！！！！！！！！！！！！！！！！！");
			System.out.println("The name of method: "+mt[i].getName());
			String strReturn=mt[i].getReturnType().getName();
			try {
				switch(strReturn) {
				case "void":
					mt[i].invoke(lclass);
					break;
				case "int":
					System.out.println("Result: "+mt[i].invoke(lclass, 12));
					break;
				case "float":
					System.out.println("Result: "+mt[i].invoke(lclass, 3.14F,12));
					break;
				case "java.lang.String":
					if(i==0) {
						mt[i].invoke(lclass);
					}else {
						Object[] obj=new Object[] {new String[] {"JAVA","LEARNING","NOTE"}};
						System.out.println("Result: "+mt[i].invoke(lclass, obj));
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
