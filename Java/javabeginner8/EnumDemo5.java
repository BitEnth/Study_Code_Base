package javabeginner8;

public class EnumDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(SubDirs dir:SubDirs.values()) {
			dir.show();
			System.out.println("Property: "+dir.getDirection());
		}
	}

}
