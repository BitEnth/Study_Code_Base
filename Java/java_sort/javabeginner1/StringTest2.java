package javabeginner1;
import java.util.StringTokenizer;
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is a programming language";
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
