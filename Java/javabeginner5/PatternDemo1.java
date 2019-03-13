package javabeginner5;

import java.util.regex.Pattern;

public class PatternDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SON OF BITCH/IT'S FUCKING BULLSHIT/WHAT THE FUCKING SHIT ON YOUR MIND/DAMN FUCKING SHIT A LOT ";
		Pattern pat=Pattern.compile("[/]");
		String rse[]=pat.split(str);
		System.out.println("Before division: \n"+str);
		System.out.println("After division: ");
		for(String s:rse) {
			System.out.println(s);
		}
		
	}

}
