package javabeginner7;

import java.util.*;

public class CollectionsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>arrList1=new ArrayList<String>();
		arrList1.add("2");
		arrList1.add("12");
		arrList1.add("1");
		arrList1.add("11");
		arrList1.add("3");
		Collections.sort(arrList1);
		Iterator<String>it1=arrList1.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println();
		List<Integer>arrList2=new ArrayList<Integer>();
		arrList2.add(2);
		arrList2.add(12);
		arrList2.add(1);
		arrList2.add(11);
		arrList2.add(3);
		Collections.sort(arrList2);
		for(int i:arrList2) {
			System.out.print(i+" ");
		}
	}

}
