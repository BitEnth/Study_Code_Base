package javabeginner3;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ScannerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filetest3.txt");
		if(!(file.exists())) {
			System.out.println("File doesn't exist! ");
			System.exit(0);
		}
		FileInputStream fis=null;
		Scanner scan=null;
		try {
			fis=new FileInputStream(file);
			scan=new Scanner(fis);
		}catch(IOException e) {
			e.printStackTrace();
		}
		StringBuffer sbu=new StringBuffer();
		while(scan.hasNext()) {
			sbu.append(scan.nextLine()).append("\n");
		}
		System.out.print(sbu);
	}

}
