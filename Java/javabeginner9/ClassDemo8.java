package javabeginner9;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?>c=null;
		try {
			c=Class.forName("javabeginner9.LocaderClass");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		Method method[]=c.getDeclaredMethods();
		for(int i=0;i<method.length;i++) {
			System.out.println("！！！！！！！！！！！！！！！！！！！！！！");
			System.out.println("The name of method: "+method[i].getName());
			int mod=method[i].getModifiers();
			System.out.println("the method's modifier: "+Modifier.toString(mod));
			Class<?>cReturn=method[i].getReturnType();
			System.out.println("The type of return value: "+cReturn.getName());
			System.out.println("whether the value is variable: "+method[i].isVarArgs());
			System.out.println("The type of parameters: ");
			Class<?>cParameters[]=method[i].getParameterTypes();
			for(int j=0;j<cParameters.length;j++) {
				System.out.print(cParameters[j].getName()+" ");
			}
			Class<?>cException[]=method[i].getExceptionTypes();
			System.out.println("\nthe type of exceptions: ");
			for(int k=0;k<cException.length;k++) {
				System.out.print(cException[k].getName()+" ");
				System.out.println();
			}
		}
	}

}
