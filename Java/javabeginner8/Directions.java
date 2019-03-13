package javabeginner8;

public enum Directions{
	EAST,SOUTH,WEST,NORTH;
	private String name;
	private Directions() {
		this(null);
	}
	private Directions(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		switch(this) {
			case EAST:
				if(name.equals("¡ú")) {
					this.name=name;
				}else {
					System.out.println("ERROR!");
					return;
				}
				break;
			case SOUTH:
				if(name.equals("¡ý")) {
					this.name=name;
				}else {
					System.out.println("ERROR!");
					return;
				}
				break;
			case WEST:
				if(name.equals("¡û")) {
					this.name=name;
				}else {
					System.out.println("ERROR!");
					return;
				}
				break;
			case NORTH:
				if(name.equals("¡ü")) {
					this.name=name;
				}else {
					System.out.println("ERROR!");
					return;
				}
		}
	}
	
}
