package javabeginner5;

public class RuntimeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt=Runtime.getRuntime();
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			rt.exec("calc.exe");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
