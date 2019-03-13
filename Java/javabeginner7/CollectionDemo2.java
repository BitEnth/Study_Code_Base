package javabeginner7;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list1=new ArrayList<String>();
		list1.add("A");
		list1.add("M");
		Collections.addAll(list1, "A","B","D","Z","O");
		Iterator<String>it1=list1.iterator();
		System.out.println("Before sortion: ");
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		Collections.sort(list1);
		Iterator<String>it2=list1.iterator();
		System.out.println("\nAfter sortion: ");
		while(it2.hasNext()) {
			System.out.print(it2.next()+" ");
		}
		System.out.println("\nWhether M exists in the collection: "+Collections.binarySearch(list1, "M"));
		System.out.println("Whether U exists in the collection: "+Collections.binarySearch(list1, "U"));
		Collections.replaceAll(list1, "A", "1");
		Iterator<String>it3=list1.iterator();
		System.out.println("After replace: ");
		while(it3.hasNext()) {
			System.out.print(it3.next()+" ");
		}
	}

}
