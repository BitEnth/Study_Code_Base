package javabeginner2;

public class PersonFC {
	protected String name;
	protected int age;
	float popu=13.7f;
	static double accPopu=1370536875;
	protected float PI=3.1415926f;
	public PersonFC() {
		System.out.println("constructive method of PersonFC");
	}
	public PersonFC(String arg1,int arg2) {
		this.name=arg1;
		this.age=arg2;
	}
	public PersonFC(String arg1) {
		this.setName(arg1);
	}
	public void setName(String arg) {
		this.name=arg;
	}
	public void setAge(int arg) {
		this.age=arg;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	protected void respire() {
		System.out.println("Breathe");
	}
	private void tell() {
		System.out.println("Person Father Class-tell method");
	}
	public void Print() {
		tell();
	}
	public void population() {
		System.out.println("The nation population is "+accPopu+", about "+popu+" one hundred thousands");
	}
	public void tellpopu() {
		System.out.println("The national population is "+accPopu+", about "+popu+" one hundred thousands");
	}
	public void tellIdentify() {
		System.out.println("My name is "+this.name+", and I'm "+this.age+" years old.");
	}
	public String getObject() {
		System.out.println("the object using getObject method is "+this);
		return null;
	}
	public PersonFC returnObject() {
		System.out.println("the object using returnObject method is "+this);
		return this;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
