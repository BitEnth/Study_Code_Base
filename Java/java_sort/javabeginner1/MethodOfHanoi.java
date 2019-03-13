package javabeginner1;
import java.util.Scanner;
public class MethodOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input the number of plates: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		hanoi(num,'A','B','C');
	}
	public static void move(char a,char c) {
		System.out.println("move from "+a+" to "+c);
		return;
	}
	public static void hanoi(int num,char a,char b,char c) {
		if(num==1) {
			move(a,c);
		}else {
			hanoi(num-1,a,c,b);
			move(a,c);
			hanoi(num-1,b,a,c);
		}
	}

}
