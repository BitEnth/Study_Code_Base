package javabeginner3;
import java.util.Scanner;
public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String pattern="^[a-zA-Z0-9_\\.]+@[a-zA-Z0-9-]+[\\.a-zA-Z]+$";
		System.out.println("Please input the adderss of email: ");
		String mail=null;
		if(scan.hasNext(pattern)) {
			mail=scan.nextLine();
			System.out.println("Your email: "+mail);
		}else {
			System.out.println("the format you input is wrong!");
		}
	}

}
