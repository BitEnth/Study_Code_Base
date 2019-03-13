package javabeginner3;
import java.io.OutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class OutputStreamDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filetest1.txt");
		OutputStream out=null;
		String str="Hello Java! This is a fucking bullshit damn asshole world! ";
		byte b[]=str.getBytes();
		try {
			out=new FileOutputStream(file1,true);
			out.write(b);
			out.close();
			System.out.println("Write successsfully! ");
		}catch(IOException e) {
			System.out.println("Fail to write!");
			e.printStackTrace();
		}
	}

}
