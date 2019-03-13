package javabeginner5;

public class HumanFC implements Cloneable{
	private String name;
	private int age;
	public HumanFC() {}
	public HumanFC(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return ("name: "+name+", age: "+age);
	}
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null) {
			return false;
		}
		//Whether this object belongs to HumanFC class
		if(!(o instanceof HumanFC)) {
			return false;
		}
		//Transfer o to HumanFC object
		HumanFC hum=(HumanFC)o;
		//Whether the property of two object is the same
		if(this.name.equals(hum.name)&&this.age==hum.age) {
			return true;
		}else {
			return false;
		}
	}
	public int hashCode() {
		final int prime=13;
		int result=13;
		result=prime*result+((name==null?0:name.hashCode()));
		result=prime*result+age;
		return result;
	}
	public static HumanFC clone(HumanFC hum1) throws CloneNotSupportedException{
		return ((HumanFC)hum1.clone());
	}
	public void finalize() throws Throwable{
		System.out.println("release the object: "+this);
		super.finalize();
	}
}
