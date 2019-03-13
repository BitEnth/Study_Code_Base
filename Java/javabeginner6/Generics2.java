package javabeginner6;

public class Generics2 <T,S>{
	private T objt;
	private S objs;
	public Generics2() {}
	public Generics2(T objt,S objs) {
		this.setObjt(objt);
		this.setObjs(objs);
	}
	public void setObjt(T objt) {
		this.objt=objt;
	}
	public void setObjs(S objs) {
		this.objs=objs;
	}
	public T getObjt() {
		return objt;
	}
	public S getObjs() {
		return objs;
	}
	public void show() {
		System.out.println("Name: "+this.getObjt()+" Age: "+this.getObjs());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
