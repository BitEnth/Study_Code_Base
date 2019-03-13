package javabeginner2;
import javabeginner2.PersonFC;
class Student3 extends PersonFC{
	float popu=1.08f;
	static double accPopu=108640700;
	public Student3() {
		System.out.println("constructive method of Student3");
	}
	public void population() {
		System.out.println("The national population is "+accPopu+", about "+popu+" one hundred thousands");
	}
}
public class ExtendDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 stu=new Student3();
		stu.population();
		stu.tellpopu();
		PersonFC per=new PersonFC();
		per.population();
		PersonFC per1=new PersonFC("DarkKnight");
		per1.setAge(33);
		per1.tellIdentify();
	}

}
