package javabeginner9;

public class Student1 {
	private String name;
	private int age;
	public Student1() {}
	public Student1(String name) {
		this.name=name;
	}
	public Student1(int age) {
		this.age=age;
	}
	public Student1(String name,int age) {
		setName(name);
		setAge(age);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return ("Name: "+getName()+"  Age: "+getAge());
	}
}
