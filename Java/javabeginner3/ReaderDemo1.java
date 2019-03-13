package javabeginner3;
import java.io.File;
import java.io.Reader;
import java.io.IOException;
import java.io.FileReader;
public class ReaderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\CSGO\\ssfn22139100594280190");
		Reader read=null;
		char c[]=new char[(int)file1.length()];
		int temp=0,len=0;
		try {
			read=new FileReader(file1);
			//read.read(c);
			while((temp=read.read())!=-1) {
				c[len]=(char)temp;
				len++;
			}
			read.close();
		}catch(IOException e) {
			System.out.println("Fail to read!");
			e.printStackTrace();
		}
		System.out.println(c);
	}

}
