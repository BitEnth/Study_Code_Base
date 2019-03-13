package javabeginner2;
import javabeginner2.PersonFC;
class Student4 extends PersonFC{
	private String school;
	public Student4() {}
	public Student4(String arg1,int arg2,String arg3) {
		super(arg1,arg2);
		this.school=arg3;
	}
	public void setSchool(String arg) {
		this.school=arg;
	}
	public String getSchool() {
		return school;
	}
	public void tellIdentify() {
		super.tellIdentify();
		System.out.println("My name is "+this.getName()+", and I¡®m "+this.getAge()+" years old. And I know Pi is "+super.PI);
	}
	
}
public class ExtendDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 stu=new Student4();
		stu.setName("Halo");
		stu.setAge(36);
		stu.setSchool("Faking College");
		stu.tellIdentify();
		Student4 stu1=new Student4("Waldon",45,"Hikey University");
		stu1.tellIdentify();
	}

}
