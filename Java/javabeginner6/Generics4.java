package javabeginner6;

public class Generics4 <T> implements InterGenerics<T>{
	private T obj;
	public Generics4() {}
	public Generics4(T obj) {
		this.setObj(obj);
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}
	public void show() {
		System.out.println("The object is "+this.getObj().toString());
	}
}
