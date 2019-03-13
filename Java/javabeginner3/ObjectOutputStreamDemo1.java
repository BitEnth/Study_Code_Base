package javabeginner3;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javabeginner3.StudentEC;

public class ObjectOutputStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEC stu1=new StudentEC("Uio",14,"Fack Senior High School");
		StudentEC stu2=new StudentEC("Youguess",20,"Ducky University");
		File file=new File("D:\\EclipseWorkSpace\\JavaBeginner\\ObjectStudentEC.osec");
		FileOutputStream fout=null;
		ObjectOutputStream oos=null;
		try {
			fout=new FileOutputStream(file);
			oos=new ObjectOutputStream(fout);
			oos.writeObject(stu1);
			oos.writeObject(stu2);
			oos.close();
			System.out.println("Write successfully!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
