package javabeginner2;

class Human2{
	private String name;
	public Human2() {};
	public Human2(String name) {
		this.name=name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class ObjectArrDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human2 per[]=new Human2[4];
		Human2 h1=new Human2("Rothur");
		Human2 h2=new Human2("Nancop");
		Human2 h3=new Human2("Oliver");
		Human2 h4=new Human2("Lumisey");
		per[0]=h1;
		per[1]=h2;
		per[2]=h3;
		per[3]=h4;
		for(Human2 p:per) {
			System.out.print(p.getName()+" ");
		}
		System.out.println();
		for(int i=0;i<per.length;i++) {
			System.out.print(per[i].getName()+" ");
		}
		System.out.println();
		Human2 per1[]= {new Human2("Fuck"),new Human2("You"),new Human2("Nigga"),new Human2("Asshole")};
		for(Human2 hum:per1) {
			System.out.print(hum.getName()+" ");
		}
		System.out.println();
		for(int h=0;h<per1.length;h++) {
			per1[h].setName("auisduaiod");
		}
		for(int j=0;j<per1.length;j++) {
			System.out.println(per1[j].getName());
		}
	}

}
