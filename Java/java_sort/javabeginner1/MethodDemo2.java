package javabeginner1;

public class MethodDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=add(2,3);
		System.out.println("add(2,3)="+sum1);
		float sum2=add(1.23f,7.89f);
		System.out.println("1.23+7.89="+sum2);
		int sum3=add(12,89,90);
		System.out.println("12+89+90="+sum3);
		System.out.print("1.09+8.67+3.61=");
		add(1.09f,8.63f,3.61f);
	}
	public static int add(int x,int y) {
		return x+y;
	}
	public static float add(float x,float y) {
		return x+y;
	}
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	public static void add(float x,float y,float z) {
		System.out.print(x+y+z);
		return;
	}

}
