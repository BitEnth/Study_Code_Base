package javabeginner6;

public class GenericsDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics5 gen=new Generics5();
		System.out.println("Name: "+gen.show("SACRE"));
		Generics5.staticShow("Hatto", 35);
		System.out.println("Name: "+gen.<String>show("Dcrocy"));
		Generics5.<String,Integer>staticShow("Orouch", 54);
	}

}
