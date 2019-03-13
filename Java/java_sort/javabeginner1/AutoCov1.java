package javabeginner1;

public class AutoCov1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=8;
		int i=b;
		System.out.println("byte to int:\t"+i);
		char c='A';
		i=c;   //ASCII
		System.out.println("char to int:\t"+i);
		float f=i;
		System.out.println("int to float:\t"+f);
		int i1=1234567890;
		float f1=i1;
		System.out.println(f1);
		String name="My name is Birdman";
		int age=5;
		float grade=98.5F;
		String str =name+". I'm "+age+" years old, and my mask of math is "+grade;
		System.out.println(str);
	}

}
