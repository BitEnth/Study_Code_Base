package javabeginner3;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;
public class ZipFileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filezip1.zip");
		try {
			ZipFile zip=new ZipFile(file1);
			System.out.println("the name of the file: "+zip.getName());
			System.out.println("the number of the compressed file: "+zip.size());
			System.out.println("the size of the file: "+file1.length());
			System.out.println("last time the file modified: "+file1.lastModified());
			zip.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
