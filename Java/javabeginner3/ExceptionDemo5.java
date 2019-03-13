package javabeginner3;
import java.util.Scanner;
class MyNumberException extends Exception{
	public MyNumberException() {};
	public MyNumberException(String message) {
		super(message);
	}
}
public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		try {
			for(int i=0;i<arr.length;i++) {
				System.out.print("Number "+(i+1)+" element: ");
				arr[i]=scan.nextInt();
				if(0>arr[i]||arr[i]>100) {
					throw new MyNumberException("Number "+(i+1)+" element you input is out of the scope: 0~100");
				}
			}
		}catch(MyNumberException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
