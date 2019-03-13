package javabeginner1;

public class Primenum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=false;
		int k=2;
		System.out.print("2\t");
		System.out.print("3\t");
		for(int i=3;i<100;i+=2) {
			if(i%2!=0) {
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						b=false;
						break;
					}else {
						b=true;
					}
				}
				if(b==true) {
					k++;
					System.out.print(i+"\t");
				}
			}
			if(k%5==0) {
				System.out.println();
			}
		}
		System.out.println("\nThere are "+k+" prime numbers in 1~100");
	}

}
