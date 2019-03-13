package javabeginner1;
import java.util.Scanner;
public class YangHui_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please input the row number of Yang triangle: ");
		int row=scan.nextInt();
		int yanghui[][]=new int[row][];
		for(int i=0;i<yanghui.length;i++) {
			yanghui[i]=new int[i+1];
		}
		for(int n=0;n<yanghui.length;n++) {
			for(int k=0;k<=n;k++) {
				if(k==0||n==k) {
					yanghui[n][k]=1;
				}else {
					yanghui[n][k]=yanghui[n-1][k-1]+yanghui[n-1][k];
				}
			}
		}
		for(int j=0;j<yanghui.length;j++) {
			System.out.print("Number "+(j+1)+" row: ");
			for(int m=0;m<yanghui[j].length;m++) {
				System.out.print(yanghui[j][m]+"\t");
			}
			System.out.println();
		}
	}

}
