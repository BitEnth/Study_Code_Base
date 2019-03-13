package javabeginner5;

public class RuntimeDemo2 {
	
	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		Process process=null;
		String overcmd=" taskkill /F /IM calc.exe";
		try {
			process=rt.exec("calc.exe");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			process=rt.exec(overcmd);
		}catch(Exception e) {
			e.printStackTrace();
		}
		process.destroy();
		//System.exit(0);
	}
}
