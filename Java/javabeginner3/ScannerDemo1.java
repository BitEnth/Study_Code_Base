package javabeginner3;
import java.util.Scanner;
public class ScannerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int num=0;
		float f=0.0f;
		//System.out.println("Please input the string: ");
		//String str=scan.nextLine();
		System.out.println("Please input the integer number: ");
		if(scan.hasNextInt()) {
			num=scan.nextInt();
		}else {
			System.out.println("What you input is not integer\nExit progress!");
			System.exit(0);
		}
		System.out.println("Please input the float number: ");
		if(scan.hasNextFloat()) {
			f=scan.nextFloat();
		}else {
			System.out.println("What you input is not float\nExit progress!");
			System.exit(0);
		}
		scan.useDelimiter("\r");
		System.out.println("Please input the string: ");
		String str=scan.next();
		System.out.println("Interger number: "+num+"\nfloat number: "+f+"\nstring: "+str);
	}

}
