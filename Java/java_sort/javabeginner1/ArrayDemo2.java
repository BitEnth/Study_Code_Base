package javabeginner1;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please input the number you want to find: ");
		int search=scan.nextInt();
		int arrInt[]= {11,42,13,54,15,99,83,20,25,67};
		Arrays.sort(arrInt);
		for(int i=0;i<arrInt.length;i++) {
			System.out.print(arrInt[i]+" ");
		}
		System.out.println();
		int seaInt=Arrays.binarySearch(arrInt, search);
		if(seaInt>=0) {
			System.out.println(search+" is Number "+(seaInt+1)+" element of arrInt");
		}else {
			System.out.println(seaInt+" can not find the element");
		}
	}

}
