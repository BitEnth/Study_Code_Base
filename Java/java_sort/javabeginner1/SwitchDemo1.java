package javabeginner1;
import java.util.Scanner;
public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input the year: ");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		System.out.println("Please input the month: ");
		int month=scan.nextInt();
		boolean b=false;
		if((year%4==0&&!(year%100==0))||(year%400==0)) {
			b=true;
		}
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month+" has 31 days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month+" has 30 days");
				break;
			case 2:
				if(b==true) {
					System.out.println(month+" has 29 days");
				}else{
					System.out.println(month+" has 28 days");
				}
				break;
				default:
					System.out.println("You are not human, so are you Martian?");
		}
	}

}
