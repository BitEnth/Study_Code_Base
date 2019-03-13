package javabeginner3;
import java.util.Scanner;
public class ExceptionDemo4 {
	public static void arrException(int arr[]) {
		try {
			int m=arr[2]/arr[0];
			System.out.println(arr[2]+"¡Â"+arr[0]+"="+m);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			throw new ArithmeticException("the divident cannot be zero, so arr[0] cannot be zero");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		try {
			for(int i=0;i<arr.length;i++) {
				System.out.print("Number "+(i+1)+" element: ");
				arr[i]=scan.nextInt();
			}
			arrException(arr);
		}catch(Exception e) {
			System.out.println("Error Information: "+e);
		}
	}

}
