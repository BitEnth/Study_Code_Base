package javabeginner1;

public class ContinueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			if(i==3) {
				System.out.println("Exit the cycle");
				continue;
			}
			System.out.println("i="+i);
			lable1:
				for(int j=1;j<=3;j++) {
					System.out.println("Inner cycle upper, j="+j);
					lable2:
						for(int k=1;k<=4;k++) {
							if(k==3) {
								System.out.println("##k="+k+" Exit the cycle##");
								continue lable2;
							}
							System.out.println("k="+k);
						}
					System.out.println("Inner cycle lower, j="+j);
				}
			System.out.println("the End");
		}
	}

}
