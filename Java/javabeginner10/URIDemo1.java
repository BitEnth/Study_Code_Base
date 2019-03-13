package javabeginner10;

import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class URIDemo1 {
	public static void println(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("Please input URI: ");
		Scanner scan=new Scanner(System.in);
		String urlstr=scan.nextLine();
		URL url=null;
		try {
			url=new URL(urlstr);
		}catch(Exception e) {
			e.printStackTrace();
		}
		println("Host: "+url.getHost());
		println("Path: "+url.getPath());
		println("Port: "+url.getPort());
		println("Protocol: "+url.getProtocol());
		println("The user's information: "+url.getUserInfo());
		println("Query: "+url.getQuery());
		println("the content of html: ");
		try {
			InputStream in=url.openStream();
			BufferedReader bin=new BufferedReader(new InputStreamReader(in));
			String strLine=null;
			while((strLine=bin.readLine())!=null) {
				println(strLine);
			}
			bin.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
