package javabeginner5;

public class ObjectDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanFC hum1=new HumanFC("Jagger",29);
		System.out.println(hum1.toString());
		System.out.println(hum1);
		HumanFC hum2=new HumanFC("Jagger",29);
		HumanFC hum3=new HumanFC("Denire",34);
		HumanFC hum4=null;
		try {
		hum4=HumanFC.clone(hum3);
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("the hashcode of hum1: "+hum1.hashCode());
		System.out.println("the hashcode of hum2: "+hum2.hashCode());
		System.out.println("the hashcode of hum3: "+hum3.hashCode());
		System.out.println("the hashcode of hum4: "+hum4.hashCode());
		if(hum1.equals(hum2)) {
			System.out.println("hum1 is the same as hum2");
		}else {
			System.out.println("hum1 is different with hum2");
		}
		if(hum1.equals(hum3)) {
			System.out.println("hum1 is equal to hum3");
		}else {
			System.out.println("hum1 is different with hum3");
		}
		if(hum3.equals(hum4)) {
			System.out.println("hum3 is the same as hum4");
		}else {
			System.out.println("hum3 is different with hum4");
		}
	}

}
