package javabeginner7;

import java.util.Set;
import java.util.HashSet;
import javabeginner2.PersonFC;
import javabeginner5.HumanFC;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<PersonEC1>set=new HashSet<PersonEC1>();
		set.add(new PersonEC1("Drcoker",45));
		set.add(new PersonEC1("Stray",23));
		set.add(new PersonEC1("Florry",34));
		set.add(new PersonEC1("Drcoker",45));
		for(PersonFC p:set) {
			System.out.println(p);
		}
		Set<HumanFC>sethum=new HashSet<HumanFC>();
		sethum.add(new HumanFC("Rossy",24));
		sethum.add(new HumanFC("Murphy",26));
		sethum.add(new HumanFC("Rose",28));
		sethum.add(new HumanFC("Rossy",24));
		for(HumanFC h:sethum) {
			System.out.println(h);
		}
	}

}
