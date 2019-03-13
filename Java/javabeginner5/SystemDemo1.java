package javabeginner5;

import java.util.Properties;

public class SystemDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pr=System.getProperties();
		pr.list(System.out);
	}

}
