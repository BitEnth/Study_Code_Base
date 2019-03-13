package javabeginner2;
import javabeginner2.PersonFC;
class Student2 extends PersonFC{
	private String school;
	public void setSchool(String arg) {
		this.school=arg;
	}
	public String getSchool() {
		return school;
	}
	public void tell() {
		System.out.println("Student2 from father class-tell method");
	}
}
public class ExtendDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 stu=new Student2();
		stu.setName("Vivian");
		stu.setAge(24);
		stu.setSchool("Harward University");
		stu.respire();
		System.out.println("My name is "+stu.getName()+", I'm "+stu.getAge()+" years old. And I'm in "+stu.getSchool());
		new Student2().Print();
		
	}

}
