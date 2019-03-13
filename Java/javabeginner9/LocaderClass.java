package javabeginner9;

public class LocaderClass {
	private static int num=10;
	protected boolean b=true;
	public long l1=123456L;
	String str="Java";
	static {
		System.out.println("This is the static code demo of LocaderClass");
	}
	public static void staticMathod() {
		System.out.println("Hello World!");
	}
	public int publicMethod(int i)throws ClassCastException, NumberFormatException {
		return i*2;
	}
	protected float protectedMethod(float f,int i) {
		return f+i;
	}
	@SuppressWarnings("unused")
	private String privateMethod(String...str) {
		return str[0];
	}
	public String toString() {
		return ("num="+num+", b="+b+", l1="+l1+", str="+str);
	}
}
