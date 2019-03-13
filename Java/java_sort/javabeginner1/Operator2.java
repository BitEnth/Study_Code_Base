package javabeginner1;

public class Operator2 {
	
	public static void main(String[] args) {
		int i=3,k=5;
		int j=i+++k;
		System.out.println("i="+i+"\tk="+k);
		int l=++k+i;
		System.out.println("i="+i+"\tk="+k+"\nj="+j+"\nl="+l);
		Operator2 ope=new Operator2();
		ope.fermin(i);
		System.out.println("i="+i);
		int e=0,g,h,m=0,p;
		g=++e;
		p=m++;
		h=i++;
		System.out.println("i="+i+"\te="+e+"\tg="+g+"\th="+h+"\tm="+m+"\tp="+p);
	}
	void fermin(int i) {
		i++;
		System.out.println("i="+i);
		return;
	}
}
