package javabeginner2;

public class EnclosingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		Integer in=new Integer(x);
		System.out.println("Integer class in="+in);
		Float f=new Float(3.1415f);
		float y=f.floatValue();
		System.out.println("Basic float variable y="+y);
		Integer IN=x;
		System.out.println("Integer class IN="+IN);
		float Y=f;
		System.out.println("Basic float variable Y="+Y);
		Long lo=new Long(123L);
		Double d=new Double(3.1415926d);
		String int2str=in.toString();
		String long2str=lo.toString();
		String dou2str=d.toString();
		System.out.println("Number to String, in="+int2str+", lo="+long2str+", d="+dou2str);
		String strInt="123";
		String strDouble="3.1415926";
		int i=Integer.parseInt(strInt);
		Double d1=Double.parseDouble(strDouble);
		System.out.println("i¡Ád="+(i*d1));
		if(Boolean.parseBoolean("TRUE")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
