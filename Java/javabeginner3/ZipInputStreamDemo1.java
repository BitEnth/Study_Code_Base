package javabeginner3;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
public class ZipInputStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dirFile=new File("D:\\EclipseWorkSpace\\JavaBeginner\\mkdirtest");
		File zipFile=new File("D:\\EclipseWorkSpace\\JavaBeginner\\zipFile1.zip");
		if(!(dirFile.exists())) {
			dirFile.mkdirs();
		}
		FileInputStream fis=null;
		FileOutputStream fout=null;
		ZipInputStream zin=null;
		ZipEntry z=null;
		byte b[]=new byte[1024];
		int temp=0;
		try {
			fis=new FileInputStream(zipFile);
			zin=new ZipInputStream(fis);
			while((z=zin.getNextEntry())!=null) {
				System.out.println("Decompress: "+z.getName());
				if(z.isDirectory()) {
					String name=z.getName();
					name=name.substring(0,name.length()-1);
					File f1=new File(dirFile+File.separator+name);
					f1.mkdir();
				}else {
					File f2=new File(dirFile+File.separator+z.getName());
					f2.createNewFile();
					fout=new FileOutputStream(f2);
					while((temp=zin.read(b))!=-1) {
						fout.write(b, 0, temp);
					}
					fout.close();
				}
			}
			//fout.close();
			zin.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
