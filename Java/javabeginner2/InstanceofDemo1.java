package javabeginner2;
import javabeginner2.PersonFC;
import javabeginner2.Student5;
public class InstanceofDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonFC per=new Student5();
		System.out.println("per belongs to PersonFC class: "+(per instanceof PersonFC));
		System.out.println("per belongs to Student5 class: "+(per instanceof Student5));
		Student5 stu=(Student5)per;
		System.out.println("stu belongs to PersonFC class: "+(stu instanceof PersonFC));
		System.out.println("stu belongs to Student5 class: "+(stu instanceof Student5));
		PersonFC per2=new PersonFC();
		System.out.println("per2 belongs to PersonFC class: "+(per2 instanceof PersonFC));
		System.out.println("per2 belongs to Student5 class: "+(per2 instanceof Student5));
	}

}
