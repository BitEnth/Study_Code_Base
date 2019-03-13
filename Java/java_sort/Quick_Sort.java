package java_sort;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {13,23,90,74,293,27,128,384,329,6712,123,238,230,1278,123};
		System.out.println("the undealt array: ");
		for(int n:array) {
			System.out.print(n+" ");
		}
		array=quickSort(array,0,array.length-1);
		for(int m:array) {
			System.out.print(m+" ");
		}
	}
	/*
	 * the quick sort: from low to high
	 */
	public static int[] quickSort(int[] arr,int lowIndex,int highIndex) {
		if(lowIndex<highIndex) {
			int s=arr[lowIndex];
			int i=lowIndex;
			int j=highIndex+1;
			while(true) {
				while(i+1<arr.length&&arr[++i]<s);
				while(j-1>-1&&arr[--j]>s);
				if(i>=j) {
					break;
				}else {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			arr[lowIndex]=arr[j];
			arr[j]=s;
			quickSort(arr,lowIndex,j-1);
			quickSort(arr,j+1,highIndex);
		}else {
			System.out.println("What the fucking wrong with you?");
		}
		return arr;
	}

}
