package javabeginner5;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String strIP=scan.nextLine();
		Pattern pat=Pattern.compile(regex);
		Matcher mat=pat.matcher(strIP);
		if(mat.matches()) {
			System.out.println("IP address is right.");
		}else {
			System.out.println("IP address is illegal.");
		}
	}

}
