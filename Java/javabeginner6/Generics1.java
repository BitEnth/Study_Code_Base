package javabeginner6;

public class Generics1<T> {
	private T obj;
	public Generics1() {}
	public Generics1(T obj) {
		this.obj=obj;
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}
	public String toString() {
		return getObj().toString();
	}
}
