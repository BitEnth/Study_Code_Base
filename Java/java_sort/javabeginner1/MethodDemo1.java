package javabeginner1;

public class MethodDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {58,4950,32,2348,109,31,48,204,8694,39};
		int arrSort[]=insertionSort(arr);
		for(int j:arrSort) {
			System.out.print(j+" ");
		}
	}
	public static int[] insertionSort(int array[]) {
		for(int i=1;i<array.length;i++) {
			for(int k=i;k>0;k--) {
				if(array[k]<array[k-1]) {
					int temp=array[k];
					array[k]=array[k-1];
					array[k-1]=temp;
				}
			}
		}
		return array;
	}

}
