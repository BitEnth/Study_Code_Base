package javabeginner3;
import java.io.*;
import java.util.*;
public class CodeFileTest1 {
	private String strInput;
	private String strOutput;
	private String strRead;
	public void setByte(byte b[],String str) {
		b=str.getBytes();
	}
	public static void createFile(File file) {
		try {
			file.createNewFile();
			System.out.println("Create Successfully! ");
		}catch(IOException e) {
			System.out.println("Fail to Create!");
			e.printStackTrace();
		}
	}
	public void writeWithCode(File file) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Please input what you want: ");
		//input words which can be with space
		strInput=scan.nextLine();
		encrypt();
		byte bWrite[]=strOutput.getBytes();
		//setByte(bWrite,strInput);
		writeOut(file,bWrite);
	}
	public void writeOut(File file,byte bWrite[]) {
		try {
			OutputStream out=new FileOutputStream(file);
			out.write(bWrite);
			out.close();
			System.out.println("Write Successfully!");
		}catch(IOException e) {
			System.out.println("Fail to Write!");
			e.printStackTrace();
		}
	}
	public void readFile(File file) {
		byte bRead[]=new byte[(int)file.length()];
		try {
		InputStream input=new FileInputStream(file);
		input.read(bRead);
		input.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		strRead=new String(bRead);
		System.out.println(strRead);
	}
	/*
	 * encrypt the file
	 */
	public void encrypt() {
		int temp;
		char str2char[]=strInput.toCharArray();
		System.out.println("before code:");
		for(char c1:str2char) {
			System.out.print(c1);
		}
		for(int i=0;i<str2char.length;i++) {
			temp=(int)str2char[i];
			temp=temp+5;
			str2char[i]=(char)temp;
		}
		System.out.println("\nAfter code:");
		for(char c2:str2char) {
			System.out.print(c2);
		}
		System.out.println();
		strOutput=new String(str2char);
	}
	/*
	 * decrypt the file
	 */
	public void decrypt() {
		int temp;
		char str2char[]=strRead.toCharArray();
		for(int i=0;i<str2char.length;i++) {
			temp=(int)str2char[i];
			temp=temp-5;
			str2char[i]=(char)temp;
		}
		System.out.println(str2char);
	}
	public static void main(String[] args) {
		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\CodeFile1.0");
		createFile(file1);
		CodeFileTest1 cft=new CodeFileTest1();
		cft.writeWithCode(file1);
		cft.readFile(file1);
		cft.decrypt();
	}

}
