package javabeginner7;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>st1=new Stack<String>();
		st1.push("A");
		st1.push("B");
		st1.push("C");
		st1.push("D");
		Iterator<String>it1=st1.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println("\nOut of stack: "+st1.pop());
		System.out.println("Out of stack: "+st1.pop());
		System.out.println("Out of stack: "+st1.pop());
		System.out.println("Out of stack: "+st1.pop());
		System.out.println(st1.isEmpty());
	}

}
