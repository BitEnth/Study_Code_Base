package javabeginner7;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list1=new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		Collections.addAll(list1, "1","2","3");
		Iterator<String>it1=list1.iterator();
		System.out.println("Output the elements of the collection: ");
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		Collections.reverse(list1);
		System.out.println("\nOutput with opposed order: ");
		Iterator<String>it2=list1.iterator();
		while(it2.hasNext()) {
			System.out.print(it2.next()+" ");
		}
	}

}
