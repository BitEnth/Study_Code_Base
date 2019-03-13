package javabeginner1;

public class IfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=18;
		if(i%2==0) {
			System.out.println("i="+i+" can be divisible by 2");
		}else {
			System.out.println("i="+i+" can not be divisible by 2");
		}
		if(i%3==0) {
			System.out.println("i="+i+" can be divisible by 3");
		}else {
			System.out.println("i="+i+" can not be divisible by 3");
		}
		if(i%4==0) {
			System.out.println("i="+i+" can be divisible by 4");
		}else {
			System.out.println("i="+i+" can not be divisible by 4");
		}
		int a=12,b=18;
		if(a>10) {
			if(b>20) {
				System.out.println("1.Run");
			}else {
				System.out.println("2.Run");
			}
			System.out.println("3.Run");
		}
	}

}
