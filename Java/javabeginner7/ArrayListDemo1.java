package javabeginner7;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> col1=new ArrayList<String>();
		List<String>list1=new ArrayList<String>();
		col1.add("Echo");
		col1.add("Tdyller");
		col1.add("Uuxi");
		System.out.println("Collection: "+col1);
		list1.add("ETX");
		list1.add("DEG");
		list1.add(1,"CBD");
		list1.addAll(0, col1);
		System.out.println("List collection(before deletion): "+list1);
		list1.remove("CBD");
		list1.remove(3);
		System.out.println("List collection(after deletion-1): "+list1);
		list1.removeAll(col1);
		System.out.println("List collection(after deletion-2): "+list1);
	}

}
