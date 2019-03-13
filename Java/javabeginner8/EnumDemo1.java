package javabeginner8;

public class EnumDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directions dir=Directions.EAST;
		System.out.println("The member of enum: "+dir);
		System.out.println("-----Output with for-----");
		for(int i=0;i<Directions.values().length;i++) {
			System.out.print(Directions.values()[i]+" ");
		}
		System.out.println("\n-----Output with foreach-----");
		for(Directions d:Directions.values()) {
			System.out.print(d+" ");
		}
		System.out.println();
		for(Directions d1:Directions.values()) {
			System.out.println("The location of index: "+d1.ordinal()+"  The name of enum's member: "+d1.name());
		}
		//dir.setName("@");
		dir.setName("¡ú");
		System.out.println("Property: "+dir.getName());
		Directions dirN=Enum.valueOf(Directions.class, "NORTH");
		dirN.setName("%");
	}

}
