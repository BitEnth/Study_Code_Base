package javabeginner1;

public class IfMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6,b=8,c=11;
		String str1=("a="+a+"\tb="+b+"\tc="+c+"\nThe maximum is ");
		if(a>b) {
			if(a>c) {
				System.out.println(str1+a);
			}else {
				System.out.println(str1+c);
			}
		}else {
			if(b>c) {
				System.out.println(str1+b);
			}else {
				System.out.println(str1+c);
			}
		}
	}

}
