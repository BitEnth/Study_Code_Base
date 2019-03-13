package java_sort;
import java.util.Scanner;
public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please input the length of array: ");
		int len=scan.nextInt();
		int score[]=new int[len];
		for(int i=0;i<len;i++) {
			System.out.println("Please input Number "+i+" element: ");
			score[i]=scan.nextInt();
		}
		System.out.println("the undealt array: ");
		for(int lang:score) {
			System.out.print(lang+" ");
		}
		System.out.println();
		/*
		 * The bubble sort: from high to low
		 */
		for(int j=0;j<len-1;j++) {
			for(int k=0;k<len-1-j;k++) {
				if(score[k]<score[k+1]) {
					int temp=score[k];
					score[k]=score[k+1];
					score[k+1]=temp;
					System.out.println("\nk="+k);
					for(int p:score) {
						System.out.print(p+" ");
					}
				}
			}
			System.out.println("\nthe Number "+(j+1)+" bubble");
			for(int m=0;m<len;m++) {
				System.out.print(score[m]+" ");
			}
		}
		System.out.println("\nthe final result: ");
		for(int n:score) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
