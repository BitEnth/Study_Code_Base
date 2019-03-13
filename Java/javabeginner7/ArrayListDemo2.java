package javabeginner7;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String>col1=new ArrayList<String>();
		List<String>list1=new ArrayList<String>();
		col1.add("One");
		col1.add("Two");
		col1.add("Three");
		list1.add("Mon.");
		list1.add("Tue.");
		list1.add("Wed.");
		list1.addAll(0, col1);
		System.out.println("List collection: "+list1);
		List<String>subList1=list1.subList(1, 5);
		System.out.println("subList collection: "+subList1);
		System.out.println("Before setting list collection: "+list1.get(3));
		list1.set(3, "MOON");
		System.out.println("After setting list collection: "+list1.get(3));
		System.out.println("The element Three's location in list1 collection: "+list1.indexOf("Three")+"\nWhere the element Y: "+list1.indexOf("Y"));
		String arrString[]=list1.toArray(new String[] {});
		for(String s:arrString) {
			System.out.print(s+" ");
		}
		System.out.println("\nWhether list1 is null: "+list1.isEmpty());
		list1.clear();
		System.out.println("Whether list1 is null: "+list1.isEmpty());
	}

}
