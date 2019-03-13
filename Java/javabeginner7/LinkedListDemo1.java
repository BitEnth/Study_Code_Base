package javabeginner7;

import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>link=new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		System.out.println("Before adding: "+link);
		System.out.println(link.size());
		link.addFirst("Zero");
		link.addLast("Four");
		System.out.println("After adding: "+link);
		LinkedList<String>newLink=new LinkedList<String>(link);
		System.out.println("Use getFirst() method: "+link.getFirst());
		System.out.println("After using get method: \n"+link);
		System.out.println("Use element() method: "+link.element());
		System.out.println("After using element(): \n"+link);
		System.out.println("Use peek() method: "+link.peek());
		System.out.println("After using peek():\n"+link);
		System.out.println("Use poll() method: "+link.poll());
		System.out.println("After using poll():\n"+link);
		System.out.println("Use pop() method: "+link.pop());
		System.out.println("After using pop():\n"+link);
		for(String s:newLink) {
			System.out.print(s+" ");
		}
		for(int i=0;i<newLink.size();i++) {
			newLink.remove(i);
		}
		System.out.println("\n"+newLink);
	}

}
