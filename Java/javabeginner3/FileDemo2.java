package javabeginner3;
import java.io.File;
import java.io.IOException;
public class FileDemo2 {
	public static void createFile(File file) {
		try {
			file.createNewFile();
			System.out.println("Create successfully! ");
		}catch(IOException e) {
			System.out.println("Fail to create! ");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\file1.0");
		if(file1.exists()) {
			file1.delete();
			System.out.println("Delete successfully!");
		}else {
			createFile(file1);
		}
	}

}
