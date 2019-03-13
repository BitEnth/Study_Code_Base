package java_sort;
import java.util.Scanner;
public class Select_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Please input the length of the array: ");
		int len=scan.nextInt();
		int score[]=new int[len];
		for(int i=0;i<len;i++) {
			System.out.print("Pleaase input Number "+(i+1)+" element: ");
			score[i]=scan.nextInt();
		}
		System.out.println("The Undealt array: ");
		for(int h:score) {
			System.out.print(h+" ");
		}
		System.out.println();
		/*
		 * The select sort: from high to low
		 */
		for(int j=0;j<len;j++) {
			int lowIndex=j;
			for(int k=j+1;k<len;k++) {
				if(score[k]>score[lowIndex]) {
					lowIndex=k;
				}
			}
			int temp=score[j];
			score[j]=score[lowIndex];
			score[lowIndex]=temp;
			System.out.println("It's Number "+(j+1)+" selection: ");
			for(int m:score) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		System.out.println("The final resault: ");
		for(int n:score) {
			System.out.print(n+" ");
		}
	}

}
