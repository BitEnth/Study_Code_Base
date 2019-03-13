package javabeginner2;

class Student{
	int number;
	public Student(int arg1) {
		this.number=arg1;
	}
}
public class ReferenceDemo1 {
	public static void add(int x,int y) {
		int k=x+y;
		y=x;
		x=k;
	}
	public static void change(Student s) {
		s.number=20;
	}
	public static void change(String s) {
		s="Fuckshit";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20;
		System.out.println("before reference: x="+x+" y="+y);
		add(x,y);
		System.out.println("after reference: x="+x+" y="+y);
		Student stu=new Student(10);
		System.out.println("before reference: "+stu.number);
		change(stu);
		System.out.println("after reference: "+stu.number);
		String str="Triual";
		System.out.println("before reference: "+str);
		change(str);
		System.out.println("after reference: "+str);
	}

}
