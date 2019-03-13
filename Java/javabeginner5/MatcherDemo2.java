package javabeginner5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherDemo2 {
	
	public static void main(String[] args) {
		String text="My name is Cork, and my tel is 13178652342, %^$#@2333";
		String regex="\\d{11}";
		Pattern pat =Pattern.compile(regex);
		Matcher mat=pat.matcher(text);
		while(mat.find()) {
			System.out.println(mat.group());
		}
	}
}
