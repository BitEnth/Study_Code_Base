package javabeginner1;

public class NestForDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(i+"x"+k+"="+(i*k)+"\t");
			}
			System.out.println();
		}
	}

}
