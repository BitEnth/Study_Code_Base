package javabeginner6;

public class GenericsDemo2 {
	public static void fun(Generics2<?,?> t) {
		System.out.println("fun(): "+t);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics1<Integer>gd1=new Generics1<Integer>();
		gd1.setObj(new Integer(5));
		Integer in=gd1.getObj();
		System.out.println("The setting number is "+in);
		Generics1<Float>gd2=new Generics1<Float>();
		gd2.setObj(new Float(1.23));
		float f=gd2.getObj();
		System.out.println("The setting number is "+f);
		Generics1<Integer>gd3=new Generics1<Integer>(778);
		int in1=gd3.getObj();
		System.out.println("The setting Integer number: "+in1);
		Generics2<String,Integer>gd4=new Generics2<String,Integer>("Xay",89);
		gd4.show();
		Generics1 gd5=new Generics1();
		gd5.setObj("781");
		System.out.println(gd5.getObj());
		Generics2<?,?>gd6=new Generics2<String,Integer>("Urain",56);
		gd6.show();
		fun(gd6);
	}

}
