package javabeginner6;

public class GenericsDemo3 {
	public static void info(Generics3<? extends Number> t) {
		System.out.println("info(): "+t.getObj());
	}
	public static void inc(Generics1<? super Integer> t) {
		System.out.println("inc(): "+t);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics3<Integer>gd1=new Generics3<Integer>();
		gd1.setObj(23);
		gd1.show(gd1);
		info(gd1);
		Generics3<Double>gd2=new Generics3<Double>();
		gd2.setObj(7.120910);
		gd2.show(gd2);
		info(gd2);
		Generics1<Integer>gd3=new Generics1<Integer>(21);
		inc(gd3);
	}

}
