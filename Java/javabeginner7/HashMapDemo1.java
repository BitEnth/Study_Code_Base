package javabeginner7;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RanStrNum r1=new RanStrNum();
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(1, "WHAT");
		map.put(2, "THE");
		map.put(3, "FUCKING");
		map.put(4, "WRONG");
		map.put(5, "WITH");
		map.put(6, "YOU");
		System.out.println("Get value: "+map.get(r1.randInt(1, 7)));
		Set<Integer>set=map.keySet();
		Iterator<Integer>itKey=set.iterator();
		while(itKey.hasNext()) {
			System.out.print(itKey.next()+" ");
		}
		System.out.println();
		Collection<String>c=map.values();
		Iterator<String>itValue=c.iterator();
		System.out.println("All value in map: ");
		while(itValue.hasNext()) {
			System.out.print(itValue.next()+" ");
		}
		System.out.println();
		//Set<Map.Entry<Integer, String>>set1=map.entrySet();
		//Iterator<Map.Entry<Integer, String>>it1=set1.iterator();
		System.out.println("Key ----- Value");
		//while(it1.hasNext()) {
			//Map.Entry<Integer, String>mapEntry=it1.next();
			//System.out.println("   "+mapEntry.getKey()+" ----- "+mapEntry.getValue());
		//}
		for(Map.Entry<Integer, String> mapEntry1:map.entrySet()) {
			System.out.println("   "+mapEntry1.getKey()+" ----- "+mapEntry1.getValue());
		}
	}

}
