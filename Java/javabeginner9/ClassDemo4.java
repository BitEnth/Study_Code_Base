package javabeginner9;

interface FirstInterface{
	
}
interface SecondInterface{
	
}
interface ThirdInterface{
	
}
class Demo1 implements FirstInterface,SecondInterface,ThirdInterface{
	
}
public class ClassDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?>inter[]=null;
		try {
			inter=Class.forName("javabeginner9.Demo1").getInterfaces();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		for(Class<?>c:inter) {
			System.out.println(c.getName());
		}
	}

}
