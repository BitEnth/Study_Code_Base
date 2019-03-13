package javabeginner6;

public class GenericsDemo5 <T,S> extends Generics1<T>{
	private S sub;
	public GenericsDemo5() {}
	public GenericsDemo5(T obj,S sub) {
		super(obj);
		setSub(sub);
	}
	public void setSub(S sub) {
		this.sub=sub;
	}
	public S getSub() {
		return sub;
	}
	public String toString() {
		return ("Name: "+super.getObj()+" Age: "+this.getSub());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsDemo5<String,Integer>p=new GenericsDemo5<String,Integer>("Ink",24);
		System.out.println(p);
	}

}
