package javabeginner3;
import java.io.ByteArrayOutputStream;
public class ByteArrayOutputStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[]= {'1','2','?','$','*'};
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		bos.write(b,0,b.length);
		System.out.println("the number of character in buffer area: "+bos.size());
		byte bout[]=bos.toByteArray();
		for(int i=0;i<bout.length;i++) {
			System.out.print((char)bout[i]+"\t");
		}
	}

}
