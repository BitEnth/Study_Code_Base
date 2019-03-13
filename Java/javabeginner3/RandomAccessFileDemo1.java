package javabeginner3;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filetest4.txt");
		RandomAccessFile raf=null;
		int i=56;
		try {
			raf=new RandomAccessFile(file,"rw");
			raf.writeInt(i);
			raf.writeChar('G');
			raf.writeLong(1742190481);
			raf.writeUTF("Fucking");
			raf.writeInt(1);
			raf.close();
			System.out.println("Write successfully!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
