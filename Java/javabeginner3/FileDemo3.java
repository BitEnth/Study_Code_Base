package javabeginner3;
import java.io.File;
public class FileDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\src\\javabeginner3\\FileDemo3.java");
		if(file1.exists()) {
			System.out.println("the name of file: "+file1.getName());
			System.out.println("the path of file: "+file1.getPath());
			System.out.println("the size of file: "+file1.length());
			System.out.println("the last modified time of file: "+file1.lastModified());
			System.out.println("write file: "+file1.canWrite()+"\tread file: "+file1.canRead());
		}else {
			System.out.println("the file does not exit! ");
		}
		File file2=new File("D:\\EclipseWorkSpace\\JavaBeginner\\src\\javabeginner3");
		String list[]=file2.list();
		System.out.println("###list()###");
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		System.out.println("###listFile()###");
		File listFile[]=file2.listFiles();
		for(File fi:listFile) {
			System.out.println(fi);
		}
	}

}
