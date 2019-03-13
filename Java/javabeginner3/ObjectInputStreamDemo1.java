package javabeginner3;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\EclipseWorkSpace\\JavaBeginner\\ObjectStudentEC.osec");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			StudentEC stu1=(StudentEC)ois.readObject();
			StudentEC stu2=(StudentEC)ois.readObject();
			ois.close();
			stu1.tellStuID();
			stu2.tellStuID();
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
