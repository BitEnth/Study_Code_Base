package javabeginner8;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<Directions>es1=EnumSet.of(Directions.EAST, Directions.WEST);
		System.out.println("-----es1 of-----");
		show(es1);
		EnumSet<Directions>es2=EnumSet.copyOf(es1);
		System.out.println("-----es2 copyof-----");
		show(es2);
		EnumSet<Directions>es3=EnumSet.range(Directions.SOUTH, Directions.NORTH);
		System.out.println("-----es3 range-----");
		show(es3);
	}
	
	public static final void show(EnumSet<Directions> enumset) {
		Iterator<Directions>it=enumset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
