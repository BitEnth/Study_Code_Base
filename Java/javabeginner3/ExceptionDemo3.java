package javabeginner3;
import java.io.IOException;
import java.io.FileInputStream;
public class ExceptionDemo3 {
	public static void arrException() throws IOException{
		@SuppressWarnings({ "unused", "resource" })
		FileInputStream f=new FileInputStream("NoExiting.txt");
	}
	public static void arrException1() {
		throw new  NullPointerException("throw out the unchecked exception: NullPointerException");
	}
	public static void arrException2() throws Exception{
		throw new IOException("throw out the checked exception: IOException");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			arrException();
		}catch(Exception e) {
			System.out.println("Error Information: "+e);
		}
		try {
			arrException1();
		}catch(Exception e){
			System.out.println(e);
		}
		try {
			arrException2();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
