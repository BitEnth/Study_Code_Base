package javabeginner2;
import javabeginner2.PersonFC;
class Student5 extends PersonFC{
	public void tell() {
		System.out.println("student tell method");
	}
	public void Print() {
		this.tell();
	}
	public void inc() {
		System.out.println("*##inc##*");
	}
}
public class UpcastingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonFC per=new Student5();
		per.Print();
		PersonFC per1=new PersonFC();
		per1.Print();
		Student5 stu=(Student5)per;
		stu.Print();
		stu.inc();
		Student5 stu2=new Student5();
		PersonFC per2=(PersonFC)stu2;
		per2.Print();
	}

}
