package javabeginner8;

public enum SubDirs implements EnumInterface {
	EAST(){
		public void show() {
			System.out.println(strE);
		}
		public String getDirection() {
			return "East";
		}
	},
	SOUTH(){
		public void show() {
			System.out.println(strS);
		}
		public String getDirection() {
			return "South";
		}
	},
	WEST(){
		public void show() {
			System.out.println(strW);
		}
		public String getDirection() {
			return "West";
		}
	},
	NORTH(){
		public void show() {
			System.out.println(strN);
		}
		public String getDirection() {
			return "North";
		}
	};
	public abstract String getDirection();
}
