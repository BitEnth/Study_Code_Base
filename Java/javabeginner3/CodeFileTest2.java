package javabeginner3;

import java.io.*;
import java.util.*;

public class CodeFileTest2 {

	private static int str_lens=1;
	private byte[] byte_input;
	private byte[] byte_readin;
	public static void createFile(File file) {
		try {
			file.createNewFile();
			System.out.println("Create Successfully! ");
		}catch(IOException e) {
			System.out.println("Fail to Create!");
			e.printStackTrace();
		}
	}
	public void printOut(File file,byte bWrite[]) {
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
	public byte[] encrypt(String strInput) {
		byte[] bout=new byte[str_lens];
		byte_input=strInput.getBytes();
		int temp=0;
		for(int i=0;i<str_lens;i++) {
			temp=(int)byte_input[i];
			temp=temp+60;
			bout[i]=(byte)temp;
		}
		return bout;
	}
	public void writeWithCode(File file) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Please input what you want: ");
		//input words which can be with space
		String strInput=scan.nextLine();
		str_lens=strInput.length();
		byte bWrite[]=encrypt(strInput);
		//setByte(bWrite,strInput);
		printOut(file,bWrite);
	}
	public void readFile(File file) {
		byte_readin=new byte[(int)file.length()];
		try {
		InputStream input=new FileInputStream(file);
		input.read(byte_readin);
		input.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		String strRead=new String(byte_readin);
		System.out.println(strRead);
	}
	public void decrypt(File file) {
		int temp=0;
		//byte_readin=new byte[(int)file.length()];
		char str2char[]=new char[(int)file.length()];
		for(int i=0;i<str2char.length;i++) {
			temp=(int)byte_readin[i];
			temp=temp-60;
			str2char[i]=(char)temp;
		}
		System.out.println(byte_readin);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file1=new File("D:\\EclipseWorkSpace\\JavaBeginner\\CodeFile1.0");
		createFile(file1);
		CodeFileTest2 cft=new CodeFileTest2();
		cft.writeWithCode(file1);
		cft.readFile(file1);
		cft.decrypt(file1);
	}

}
