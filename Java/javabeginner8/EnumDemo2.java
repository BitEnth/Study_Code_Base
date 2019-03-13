package javabeginner8;

import java.util.Map;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

public class EnumDemo2 {
	public static void main(String[] args) {
		EnumMap<Directions,String>ep1=new EnumMap<Directions,String>(Directions.class);
		ep1.put(Directions.NORTH, "��");
		ep1.put(Directions.EAST, "��");
		ep1.put(Directions.SOUTH, "��");
		ep1.put(Directions.WEST, "��");
		Set<Map.Entry<Directions, String>>set=ep1.entrySet();
		Iterator<Map.Entry<Directions, String>>it=set.iterator();
		while(it.hasNext()) {
			Map.Entry<Directions, String>me=it.next();
			System.out.println(me.getKey()+" -------- "+me.getValue());
		}
	}
}
