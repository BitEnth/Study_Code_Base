package javabeginner3;
import java.io.*;
public class SequenceInputStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filetest1.txt");
		File file2=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filetest2.txt");
		File file3=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filetest4.txt");
		FileInputStream in1=null;
		FileInputStream in2=null;
		FileOutputStream out=null;
		SequenceInputStream sis=null;
		int temp=0;
		byte b[]=new byte[256];
		try {
			in1=new FileInputStream(file1);
			in2=new FileInputStream(file2);
			out=new FileOutputStream(file3);
			sis=new SequenceInputStream(in1,in2);
			while((temp=sis.read(b))!=-1) {
				out.write(b, 0, temp);
			}
			sis.close();
			in1.close();
			in2.close();
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
