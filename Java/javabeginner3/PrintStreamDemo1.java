package javabeginner3;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;
public class PrintStreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		PrintStream ps=null;
		try {
			fos=new FileOutputStream("D:\\EclipseWorkSpace\\JavaBeginner\\file1.0");
			ps=new PrintStream(fos);
			ps.format("%1$tD %1$tY year %1$tm month %1$th %1$td day %1$tH hour %1$tM minute %1$tS second", new Date());
			ps.println();
			ps.println(true);
			ps.println(123);
			ps.println(3.1415926);
			ps.print('C');
			ps.println("HINA");
			ps.close();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
