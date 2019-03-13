package javabeginner7;

import javabeginner2.PersonFC;

public class PersonEC1 extends PersonFC implements Comparable<PersonEC1>{
		public PersonEC1() {}
		public PersonEC1(String name,int age) {
			super(name,age);
		}
		public int compareTo(PersonEC1 per) {
			if(this.age>per.age) {
				return 1;
			}else if(this.age<per.age) {
				return -1;
			}else {
				return this.name.compareTo(per.name);
			}
		}
		public String toString() {
			return ("Name: "+super.name+"\tAge: "+super.age);
		}
}
