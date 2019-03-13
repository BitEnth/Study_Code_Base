package java_sort;
import java.util.Scanner;
public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Please input the length of this array: ");
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
		System.out.println();
		/*
		 * The insertion sort: from high to low
		 */
		for(int j=1;j<len;j++) {
			for(int k=j;k>0;k--) {
				if(score[k]>score[k-1]) {
					int temp=score[k];
					score[k]=score[k-1];
					score[k-1]=temp;
				}
			}
			System.out.println("the Number "+j+" insertion: ");
			for(int m:score) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		System.out.println("the final result: ");
		for(int n:score) {
			System.out.print(n+" ");
		}
	}

}
