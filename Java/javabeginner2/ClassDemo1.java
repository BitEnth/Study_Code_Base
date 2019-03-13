package javabeginner2;

class Person{
	private String name;
	private int age;
	public Person(String arg1) {
		this.name=arg1;
	}
	public Person(int arg1) {
		this.age=arg1;
	}
	public Person(String arg1, int arg2) {
		// TODO Auto-generated constructor stub
		this.name=arg1;
		this.age=arg2;
	}
	public Person() {}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void say() {
		System.out.println("My name is "+name+" and I'm "+age+" years old.");
	}
}
public class ClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.setName("Danie");
		p1.setAge(20);
		p1.say();
		new Person("Peter",24).say();
	}

}
