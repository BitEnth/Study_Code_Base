package java_sort;
import java.util.Scanner;
public class Shell_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Please input the length of array: ");
		int len=scan.nextInt();
		int score[]=new int[len];
		for(int i=0;i<len;i++) {
			System.out.print("Please input Number "+(i+1)+" element: ");
			score[i]=scan.nextInt();
		}
		System.out.println("The undealt array: ");
		for(int h:score) {
			System.out.print(h+" ");
		}
		/*
		 * The shell sort: from high to low
		 */
		for(int incre=(len/2);incre>0;incre=incre/2) {
			for(int j=incre;j<len;j++) {
				int temp=score[j];
				int k=0;
				for(k=j;k>=incre;k=k-incre) {
					if(temp>score[k-incre]) {
						score[k]=score[k-incre];
					}else {
						break;
					}
					System.out.println();
					System.out.println("Markk "+k);
					for(int n:score) {
						System.out.print(n+" ");
					}
				}
				score[k]=temp;
				System.out.println();
				System.out.println("Markj "+j);
				for(int p:score) {
					System.out.print(p+" ");
				}
			}
			System.out.println();
			System.out.println("Markincre "+incre);
			for(int q:score) {
				System.out.print(q+" ");
			}
		}
		System.out.println();
		System.out.println("The final resault: ");
		for(int m:score) {
			System.out.print(m+" ");
		}
	}

}
