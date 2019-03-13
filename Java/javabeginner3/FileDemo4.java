package javabeginner3;
import java.io.File;
public class FileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\mkdirtest");
		if(file1.mkdir()) {
			System.out.println("Create Successfully! ");
		}else {
			System.out.println("Fail to Create!");
		}
		File file2=new File("D:\\EclipseWorkSpace\\JavaBeginner\\mkdirstest\\0");
		if(file2.mkdirs()) {
			System.out.println("Create Successfully!");
		}else {
			System.out.println("Fail to Create!");
		}
	}

}
