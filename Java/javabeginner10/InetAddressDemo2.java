package javabeginner10;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
/*
 * Need to access to Internet
 */
public class InetAddressDemo2 {
	public static final void println(Object obj) {
		System.out.println(obj);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		println("Please input the address: ");
		String dnsName=scan.nextLine();
		InetAddress dnsIP=null;
		try {
			dnsIP=InetAddress.getByName(dnsName);
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		println("IP: "+dnsIP.getHostAddress());
		println("Address' name: "+dnsIP.getHostName());
	}

}
