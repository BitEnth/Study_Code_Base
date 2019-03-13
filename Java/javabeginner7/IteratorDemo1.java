package javabeginner7;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class IteratorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>link1=new LinkedList<String>();
		link1.add("A");
		link1.add("6");
		link1.add("<");
		link1.add("☺");
		link1.add("a");
		link1.addLast("&");
		Iterator<String>it=link1.iterator();
		Iterator<String>it2=link1.iterator();
		System.out.println("The number of link1: "+link1.size());
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		while(it2.hasNext()) {
			String strIt=it2.next();
			if(strIt.equals("6")||strIt.equals("a")) {
				it2.remove();
			}else {
				System.out.print(strIt+" ");
			}
		}
	}

}
