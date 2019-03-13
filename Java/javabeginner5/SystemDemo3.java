package javabeginner5;

public class SystemDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanFC hum=new HumanFC("Stero",27);
		System.out.println(hum);
		hum=null;
		System.gc();
	}

}
