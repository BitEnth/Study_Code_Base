package javabeginner3;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
public class ZipFileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\FileTest.xqi");
		File zipFile=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filezip1.zip");
		InputStream in=null;
		FileOutputStream fout=null;
		ZipEntry entry=null;
		ZipFile zip=null;
		byte b[]=new byte[1024];
		int temp=0;
		try {
			zip=new ZipFile(zipFile);
			entry=new ZipEntry("file1.o");
			in=zip.getInputStream(entry);
			fout=new FileOutputStream(file1);
			while((temp=in.read(b))!=-1) {
				fout.write(b, 0, temp);
			}
			zip.close();
			fout.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
