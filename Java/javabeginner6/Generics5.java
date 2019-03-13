package javabeginner6;

public class Generics5 {
	public <T> T show(T t) {
		return t;
	}
	public static <T,S> void staticShow(T t,S s) {
		System.out.println("Property 1: "+t+" Property 2: "+s);
	}
}
