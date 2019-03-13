package javabeginner2;
import javabeginner2.ClassDemo1;;
class SingletonClass{
	private static final SingletonClass instance=new SingletonClass();
	private SingletonClass() {}
	public static SingletonClass getInstance() {
		return instance;
	}
	public void show() {
		System.out.println("to show");
	}
}
public class ClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass sc1=SingletonClass.getInstance();
		sc1.show();
		Person p1=new Person("Stywe",34);
		p1.say();
	}

}
