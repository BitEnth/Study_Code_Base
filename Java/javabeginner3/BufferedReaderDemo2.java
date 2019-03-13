package javabeginner3;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferedReaderDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		BufferedReader bin=null;
		try {
			bin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please input what you want: ");
			str=bin.readLine();
			bin.close();
		}catch(IOException e) {
			System.out.println("Fail to read!");
			e.printStackTrace();
		}
		System.out.println("what you input:\n"+str);
	}

}
