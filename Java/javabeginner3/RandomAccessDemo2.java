package javabeginner3;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\EclipseWorkSpace\\JavaBeginner\\file1.x");
		RandomAccessFile raf=null;
		try {
			raf=new RandomAccessFile(file,"rw");
			for(int i=0;i<10;i++) {
				raf.writeInt(i+48);
			}
			System.out.println("now the location of the pointer: "+raf.getFilePointer());
			System.out.println("the length of the file: "+raf.length()+" byte");
			raf.seek(0);
			System.out.println("now the location of the pointer: "+raf.getFilePointer());
			System.out.println("read the file");
			for(int j=0;j<6;j++) {
				System.out.println("the character: "+raf.readInt()+"--->the pointer "+raf.getFilePointer());
				if(j==3) {
					raf.seek(32);
				}
			}
			raf.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
