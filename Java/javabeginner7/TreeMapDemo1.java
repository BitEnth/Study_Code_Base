package javabeginner7;

import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RanStrNum r1=new RanStrNum();
		Map<String,String>hashMap=new HashMap<String,String>();
		hashMap.put(r1.randStrLetter(4), "FUCK");
		hashMap.put(r1.randStrLetter(4), "YOU");
		hashMap.put(r1.randStrLetter(4), "SON");
		hashMap.put(r1.randStrLetter(4),"OF");
		hashMap.put(r1.randStrLetter(4), "BITCH");
		Set<Map.Entry<String, String>>hashSet=hashMap.entrySet();
		Iterator<Map.Entry<String, String>>itHash=hashSet.iterator();
		System.out.println("******HashMap******");
		while(itHash.hasNext()) {
			Map.Entry<String, String>hashEntry=itHash.next();
			System.out.println(hashEntry.getKey()+"-------"+hashEntry.getValue());
		}
		Map<String,String>treeMap=new TreeMap<String,String>(hashMap);
		System.out.println("******TreeMap******");
		for(Map.Entry<String, String>treeEntry:treeMap.entrySet()) {
			System.out.println(treeEntry.getKey()+"-------"+treeEntry.getValue());
		}
	}

}
