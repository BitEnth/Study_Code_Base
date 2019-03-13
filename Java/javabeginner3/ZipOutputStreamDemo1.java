package javabeginner3;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class ZipOutputStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\file1.o");
		File file2=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filezip1.zip");
		FileInputStream fis=null;
		FileOutputStream fout=null;
		ZipOutputStream zout=null;
		byte b[]=new byte[(int)file1.length()];
		int temp=0;
		try {
			fis=new FileInputStream(file1);
			fout=new FileOutputStream(file2);
			zout=new ZipOutputStream(fout);
			zout.putNextEntry(new ZipEntry(file1.getName()));
			zout.setComment("Use ZipOutputStream compression file1.o");
			while((temp=fis.read(b))!=-1) {
				zout.write(b, 0, temp);
			}
			zout.close();
			fout.close();
			fis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
