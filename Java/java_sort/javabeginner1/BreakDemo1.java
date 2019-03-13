package javabeginner1;

public class BreakDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			if(i==3) {
				System.out.println("Exit the cycle");
				break;
			}
			System.out.println("i="+i);
		}
		lable1:
		for(int j=1;j<=3;j++) {
			System.out.println("Outside cycle upper, j="+j);
			for(int k=1;k<=4;k++) {
				System.out.println("Inner cycle upper, k="+k);
				if(k==2) {
					System.out.println("##i=3, Exit the cycle##");
					break lable1;
				}
				System.out.println("Inner cycle lower, k="+k);
			}
			System.out.println("Outside cycle lower, j="+j);
		}
		System.out.println("the End");
	}

}
