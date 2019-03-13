package javabeginner1;

public class WhileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		while(i<=100)
		{
			sum+=i;
			i++;
		}
		System.out.println("1+2+3+4.....+100="+sum);
		int i1=1,sum1=0;
		do {
			sum1+=i1;
			i1++;
		}while(i1<=100);
		System.out.println("The summary of 1 to 100 is "+sum1);
		int sum2=0;
		for(int i2=1;i2<=100;i2++) {
			sum2+=i2;
		}
		System.out.println("1+2+3+4，，，，，，+100="+sum2);
	}

}
