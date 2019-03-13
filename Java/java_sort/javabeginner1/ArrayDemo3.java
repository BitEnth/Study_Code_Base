package javabeginner1;
import java.util.Arrays;
public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrInt[]= {89,54,68,90,34,23,66,12,43,78,22};
		System.out.println("Copy the first 4 numbers of arrInt: ");
		int copyInt[]=Arrays.copyOf(arrInt,4);
		for(int i:copyInt) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Copy Number 4 to 8 elements of arrInt: ");
		int rangeInt[]=Arrays.copyOfRange(arrInt, 3, 8);
		for(int j:rangeInt) {
			System.out.print(j+" ");
		}
		System.out.println();
	}

}
