package javabeginner1;

public class IfDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		if(x>3) {
			System.out.println("x is larger than 3");
		}
		boolean b=false;
		if(b=true) {
			System.out.println("The exe runs sucessfully");
		}
		if(x%2==0) {
			System.out.println(x+" is an even number");
		}else {
			System.out.println(x+" is an odd number");
		}
		int a=5,c=7;
		if (a>c) {
			System.out.println("a="+a+"\tc="+c+" the maximum number is a");
		}else {
			System.out.println("a="+a+"\tc="+c+" the maximum number is c");
		}
	}

}
