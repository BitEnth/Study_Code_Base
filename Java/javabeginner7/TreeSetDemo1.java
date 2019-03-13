package javabeginner7;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>tset=new TreeSet<Integer>();
		tset.add(1);
		tset.add(10);
		tset.add(6);
		tset.add(8);
		tset.add(1);
		tset.add(7);
		tset.add(6);
		System.out.println(tset);
		RanStrNum rsn1=new RanStrNum();
		Set<PersonEC1>pset=new TreeSet<PersonEC1>();
		pset.add(new PersonEC1(rsn1.randStrLetter(6),rsn1.randInt(30)));
		pset.add(new PersonEC1(rsn1.randStrLetter(7),rsn1.randInt(20,40)));
		pset.add(new PersonEC1(rsn1.randStrLetter(7),rsn1.randInt(50)));
		pset.add(new PersonEC1(rsn1.randStrLetter(6),rsn1.randInt(20,90)));
		System.out.println(pset);
	}

}
