package javabeginner3;
import java.io.*;
public class BufferedReaderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filetest3.txt");
		Reader read=null;
		String str="";
		BufferedReader bin=null;
		try {
			read=new FileReader(file);
			bin=new BufferedReader(read);
			str=bin.readLine();
			bin.close();
			read.close();
		}catch(IOException e) {
			System.out.println("Fail to read!");
			e.printStackTrace();
		}
		System.out.println(str);
	}

}
