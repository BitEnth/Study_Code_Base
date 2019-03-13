package javabeginner1;

public class IfMaxNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7,b=8,c=10;
		int max;
		max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		System.out.println("The maximum is "+max);
		if(b<6&&++a==91)
		{
			System.out.println("1.a="+a);
		}else
		{
			System.out.println("2.a="+a);
		}
		System.out.println("a="+a);
		if(a++==b) {
			System.out.println(++a);
		}else {
			System.out.println(a++);
		}
	
	}
	
 
}
