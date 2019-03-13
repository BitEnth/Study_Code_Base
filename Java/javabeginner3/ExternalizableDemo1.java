package javabeginner3;
import java.io.*;
public class ExternalizableDemo1 {
	public static void serialize(File file) {
		Teenager teen1=new Teenager("Fytieo",21,1.78f);
		Teenager teen2=new Teenager("Patrical",23,1.86f);
		FileOutputStream fout=null;
		ObjectOutputStream oss=null;
		try {
			fout=new FileOutputStream(file);
			oss=new ObjectOutputStream(fout);
			oss.writeObject(teen1);
			oss.writeObject(teen2);
			oss.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void deserialization(File file) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			Teenager teen1=(Teenager)ois.readObject();
			Teenager teen2=(Teenager)ois.readObject();
			ois.close();
			teen1.show();
			teen2.show();
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\ObjectTeenager.ot");
		serialize(file1);
		ExternalizableDemo1.deserialization(file1);
	}

}
