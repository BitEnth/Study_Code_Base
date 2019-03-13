package javabeginner7;

import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Hashtable;

public class HashtableDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RanStrNum r1=new RanStrNum();
		Map<String,String>map=new Hashtable<String,String>();
		map.put(r1.randStrLetter(4), "WHAT");
		map.put(r1.randStrLetter(4), "THE");
		map.put(r1.randStrLetter(4), "FUCK");
		map.put(r1.randStrLetter(4), "DID");
		map.put(r1.randStrLetter(4), "YOU");
		map.put(r1.randStrLetter(4), "SAY");
		System.out.println("Key -------- Value");
		for(Map.Entry<String, String> me:map.entrySet()) {
			System.out.println(me.getKey()+" -------- "+me.getValue());
		}
	}

}
