package javabeginner3;
import java.io.*;
public class BufferedWriterDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\EclipseWorkSpace\\JavaBeginner\\file1.doc");
		FileWriter fw=null;
		BufferedWriter bw=null;
		String str[]= {"あいう","ㅇㅈㅃ","БДЖ","iəεətʃ"};
		try {
			fw=new FileWriter(file,true);
			bw=new BufferedWriter(fw);
			for(int i=0;i<str.length;i++) {
				bw.write(str[i]);
				bw.newLine();
			}
			//bw.flush();
			bw.close();
			fw.close();
			System.out.println("Write successfully!");
		}catch(IOException e) {
			System.out.println("Fail to write!");
			e.printStackTrace();
		}
	}

}
