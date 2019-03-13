package javabeginner2;

public class FinalDemo1 {
	final float PI=3.14f;
	final int arrInt[]= {1,2,3,4};
	final int num;
	final String str;
	{
		num=100;
	}
	public FinalDemo1() {
		str="Java";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char c='A';
		FinalDemo1 f1=new FinalDemo1();
		System.out.println("PI="+f1.PI);
		System.out.println("str="+f1.str);
		System.out.println("num="+f1.num);
		System.out.println("c="+c);
		System.out.println("Before change the property: ");
		for(int i=0;i<4;i++) {
			System.out.print(f1.arrInt[i]+" ");
		}
		System.out.println("\nAfter change the property: ");
		for(int h=0;h<f1.arrInt.length;h++) {
			f1.arrInt[h]=f1.arrInt[h]*10;
		}
		for(int j:f1.arrInt) {
			System.out.print(j+" ");
		}
	}

}
