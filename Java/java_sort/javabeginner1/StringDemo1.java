package javabeginner1;

public class StringDemo1 {
	public static void main(String[] args) {
		String str1="Java";
		String str2="Java";
		String str3=new String("Java");
		String str4=str3;
		System.out.println("str1="+str1+" str2="+str2+" str3="+str3+" str4="+str4);
		if(str1==str2) {
			System.out.println("str1==str2: true");
		}else {
			System.out.println("str1==str2: false");
		}
		if(str3==str4) {
			System.out.println("str3==str4: true");
		}else {
			System.out.println("str3==str4: false");
		}
		if(str1==str3) {
			System.out.println("str1==str3: true");
		}else {
			System.out.println("str1==str3: false");
		}
		if(str3.equals(str1)) {
			System.out.println("str3.equals(str1): true");
		}else {
			System.out.println("str3.equals(str1): false");
		}
	}
}
