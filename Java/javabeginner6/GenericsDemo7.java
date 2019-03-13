package javabeginner6;

public class GenericsDemo7 implements InterGenerics<String>{
	private String obj;
	public void setObj(String obj) {
		this.obj=obj;
	}
	public String getObj() {
		return obj;
	}
	public void show() {
		System.out.println(getObj());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsDemo7 g=new GenericsDemo7();
		g.setObj("6.90");
		g.show();
	}

}
