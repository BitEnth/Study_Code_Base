package javabeginner10;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress localIP=null;
		try {
			localIP=InetAddress.getLocalHost();
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("Local host's IP: "+localIP.getHostAddress());
		System.out.println("Local host's name: "+localIP.getHostName());
		System.out.println(localIP.getCanonicalHostName());
	}

}
