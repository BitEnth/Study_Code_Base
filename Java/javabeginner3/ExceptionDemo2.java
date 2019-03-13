package javabeginner3;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner read=new Scanner(System.in);
		int arr[]=new int[5];
		try {
			System.out.println("Please input the element of array: ");
			for(int i=0;i<arr.length;i++) {
				arr[i]=read.nextInt();
			}
			System.out.println("Please input the index of array: ");
			int n=read.nextInt();
			System.out.println("arr["+n+"]="+arr[n]);
			int m=arr[3]/arr[0];
			System.out.println("m="+m);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Information: "+e);
		}catch(ArithmeticException e) {
			System.out.println("Error Information: "+e);
		}catch(InputMismatchException e) {
			System.out.println("Error Information: "+e);
		}finally {
			System.exit(0);
		}
		System.out.println("the End");
	}

}
