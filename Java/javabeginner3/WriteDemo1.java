package javabeginner3;
import java.io.Writer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filetest2.txt");
		Writer wout=null;
		String strw="\r\nYuck FuckShit DamnBitch & so on@#%@$^";
		try {
			wout=new FileWriter(file,true);
			wout.write(strw);
			wout.append("\r\nHelio X20 ☺◐☑▎♬");
			//wout.flush();
			wout.close();
			System.out.println("Write successfully!");
		}catch(IOException e) {
			System.out.println("Fail to write!");
			e.printStackTrace();
		}
	}

}
