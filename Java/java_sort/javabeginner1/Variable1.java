package javabeginner1;

public class Variable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11;
		int b=22;
		System.out.println("交换前：a="+a+"、b="+b);
		a=a^b;
		System.out.println("a="+a+" b="+b);
		b=b^a;
		System.out.println("a="+a+" b="+b);
		a=a^b;
		System.out.println("交换后：a="+a+"、b="+b);
	}
}
