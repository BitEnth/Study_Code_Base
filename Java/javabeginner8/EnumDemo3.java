package javabeginner8;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumDemo3 {
	public static final void show(EnumSet<Directions> enumset1) {
		Iterator<Directions>it=enumset1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<Directions>es1=EnumSet.allOf(Directions.class);
		System.out.println("-----es1 allof-----");
		show(es1);
		EnumSet<Directions>es2=EnumSet.noneOf(Directions.class);
		es2.add(Directions.WEST);
		es2.add(Directions.NORTH);
		es2.add(Directions.SOUTH);
		es2.add(Directions.EAST);
		System.out.println("-----es2 noneof-----");
		show(es2);
		EnumSet<Directions>es3=EnumSet.noneOf(Directions.class);
		es3.addAll(es2);
		System.out.println("-----es3 noneof-----");
		show(es3);
	}

}
