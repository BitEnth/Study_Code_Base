package javabeginner6;

public class Generics3 <T extends Number>{
	private T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}
	public void show(Generics3<?> t) {
		System.out.println("show(): "+getObj());
	}
}
