package javabeginner6;

public class GenericsDemo4 <T> extends Generics1<T>{
	public GenericsDemo4() {}
	public GenericsDemo4(T obj) {
		super(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsDemo4<String>p=new GenericsDemo4<String>("Primer");
		System.out.println(p);
	}

}
