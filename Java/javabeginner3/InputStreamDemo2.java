package javabeginner3;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
public class InputStreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\JavaTest.txt");
		InputStream input=null;
		byte b[]=new byte[(int)file1.length()];
		int temp=0,len=0;
		try {
			input=new FileInputStream(file1);
			while((temp=input.read())!=-1) {
				b[len]=(byte)temp;
				len++;
			}
			input.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(new String(b));
	}

}
