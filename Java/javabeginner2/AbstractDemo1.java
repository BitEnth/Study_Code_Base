package javabeginner2;

abstract class Human1{
	public static final String country="China";
	private String name;
	public void setName(String arg1) {
		this.name=arg1;
	}
	public String getName() {
		return name;
	}
	public Human1() {
		System.out.println("abstract class Human1's constructive method");
	}
	public abstract void tell();
}
class Student7 extends Human1{
	public void tell() {
		System.out.println("I'm "+this.getName()+", and I'm from "+country);
	}
	public Student7() {
		System.out.println("extend class Student7's method");
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student7 stu7=new Student7();
		stu7.setName("Gueriw");
		stu7.tell();
	}

}
