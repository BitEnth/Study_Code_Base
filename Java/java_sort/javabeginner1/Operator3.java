package javabeginner1;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("whether 10 is bigger than 9.99999: "+(10>9.99999));
		int i1=10;
		float i2=10.0f;
		System.out.println("whether 10 is equal to 10.0: "+(i1==i2));
		boolean b=65=='A';
		System.out.println("whether 65 is equal to 'A': "+b);
		int i=5;
		Integer ier=new Integer(5);
		System.out.println("whether i belonging to integer numbers is equal to ier of objects in integer class: "+
		(i==ier));
		String str1="java";
		String str2=new String("java");
		String str3=str1;
		System.out.println("whether str1 is equal to str2: "+(str1==str2));
		System.out.println("whether str1 is equal to str3: "+(str1==str3));
	}

}
