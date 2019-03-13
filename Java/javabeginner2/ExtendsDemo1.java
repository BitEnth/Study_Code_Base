package javabeginner2;

class Person1 {
	private String name;
	private int age;
	public void setName(String arg) {
		this.name=arg;
	}
	public String getName() {
		return name;
	}
	public void setAge(int arg) {
		this.age=arg;
	}
	public int getAge() {
		return age;
	}
	public void respire() {
		System.out.println("breath");
	}
}
class Student1 extends Person1 {
	private String school;
	public void setSchool(String arg) {
		this.school=arg;
	}
	public String getSchool() {
		return school;
	}
}
public class ExtendsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stu=new Student1();
		stu.setName("Paul");
		stu.setAge(23);
		stu.setSchool("MIT");
		stu.respire();
		System.out.println("My name is "+stu.getName()+" I'm "+stu.getAge()+" years old. And I'm in"+stu.getSchool());
	}

}
