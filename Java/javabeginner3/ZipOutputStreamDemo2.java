package javabeginner3;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class ZipOutputStreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\src\\javabeginner2");
		File file2=new File("D:\\EclipseWorkSpace\\JavaBeginner\\zipFile1.zip");
		FileInputStream fis=null;
		FileOutputStream fout=null;
		ZipOutputStream zout=null;
		//String fileName[]=null;
		byte b[]=new byte[1024];
		int temp;
		try {
			fout=new FileOutputStream(file2);
			zout=new ZipOutputStream(fout);
			zout.setComment("Use ZipOutputStream compression zipDirectory");
			if(file1.isDirectory()) {
				File filePath[]=file1.listFiles();
				String fileName[]=file1.list();
				for(int i=0;i<filePath.length;i++) {
					fis=new FileInputStream(filePath[i]);
					zout.putNextEntry(new ZipEntry(fileName[i]));
					System.out.println(fileName[i]+" is being compressed........");
					while((temp=fis.read(b))!=-1) {
						zout.write(b, 0, temp);
					}
					System.out.println(fileName[i]+" has been compressed!");
				}
			}
			zout.close();
			fout.close();
			fis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
