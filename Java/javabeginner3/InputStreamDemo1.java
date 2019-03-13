package javabeginner3;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class InputStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\我的文件们\\My photos\\u=873457403,3889732115&fm=26&gp=0.jpg");
		InputStream input=null;
		long L=file1.length();
		int len=(int)L;
		byte b[]=new byte[len];
		try {
			input=new FileInputStream(file1);
			input.read(b);
			input.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		File file2=new File("D:\\我的文件们\\My photos\\u1.jpg");
		OutputStream out1=null;
		try {
			out1=new FileOutputStream(file2);
			out1.write(b);
			out1.close();
			System.out.println("Write Successfully!");
		}catch(IOException e) {
			System.out.println("Fail to Write!");
			e.printStackTrace();
		}
		System.out.println(new String(b));
	}

}
