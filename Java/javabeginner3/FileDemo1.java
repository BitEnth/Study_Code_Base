package javabeginner3;
import java.io.File;
import java.io.IOException;
public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner","file1.txt");
		try {
			file1.createNewFile();
			System.out.println("create successfully! ");
		}catch(IOException e) {
			System.out.println("Fail!");
			e.printStackTrace();
		}
	}

}
