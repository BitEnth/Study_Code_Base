package javabeginner3;
import java.io.File;
import java.util.Scanner;
public class ListFile1 {
	public static void fileList(File file) {
		if(file.isFile()) {
			System.out.println("\t"+file.getName());
		}else if(file.isDirectory()){
			System.out.println(file.getPath()+" is a directory");
			File fileName[]=file.listFiles();
			for(int i=0;i<fileName.length;i++) {
				fileList(fileName[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input the path:");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String path=scan.next();
		File file1=new File(path);
		fileList(file1);
	}

}
