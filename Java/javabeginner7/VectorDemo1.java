package javabeginner7;


import java.util.Iterator;
import java.util.Vector;
import java.util.Collections;

public class VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v1=new Vector<String>();
		v1.add("A");
		v1.addElement("B");
		v1.addElement("C");
		Collections.addAll(v1, "M","P","D");
		v1.remove(1);
		Iterator<String>it1=v1.iterator();
		System.out.println("-----Iterator-----");
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println("\n-----foreach-----");
		for(String str:v1) {
			System.out.print(str+" ");
		}
		System.out.println("\n-----get()-----");
		for(int i=0;i<v1.size();i++) {
			System.out.print(v1.get(i)+" ");
		}
	}

}
