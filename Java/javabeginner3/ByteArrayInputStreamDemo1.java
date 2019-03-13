package javabeginner3;
import java.io.IOException;
import java.io.ByteArrayInputStream;
public class ByteArrayInputStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[]= {'A','B','C','D','E','F','G'};
		ByteArrayInputStream bis=new ByteArrayInputStream(b,0,b.length);
		int temp=bis.read();
		while(temp!=-1) {
			System.out.print((char)temp+"\t");
			temp=bis.read();
		}
		try {
			bis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
