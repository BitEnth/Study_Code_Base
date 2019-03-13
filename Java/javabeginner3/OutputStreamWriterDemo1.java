package javabeginner3;
import java.io.*;
public class OutputStreamWriterDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("D:\\EclipseWorkSpace\\JavaBeginner\\filetest3.txt");
			FileOutputStream fout=new FileOutputStream(file,true);
			OutputStreamWriter osw=new OutputStreamWriter(fout);
			String str="\r\n↑↓↘↙←→↗↖☺♀♂☾☽♋△○×√☛☟㏘∷▓あㄷ♈☌卐㊥☂☺◑◐☀☼┌Âî☒圆";
			osw.write(str);
			osw.close();
			fout.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
