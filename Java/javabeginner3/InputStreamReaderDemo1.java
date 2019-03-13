package javabeginner3;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
public class InputStreamReaderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("D:\\EclipseWorkSpace\\JavaBeginner\\JavaTest.txt");
			FileInputStream fin=new FileInputStream(file);
			//InputStreamReader isr=new InputStreamReader(fin);
			//System.out.println("the system default character: "+isr.getEncoding());
			int temp=0;
			//while((temp=isr.read())!=-1) {
				//System.out.print((char)temp);
			//}
			System.out.println();
			while((temp=fin.read())!=-1) {
				System.out.print((char)temp);
			}
			//isr.close();
			fin.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
