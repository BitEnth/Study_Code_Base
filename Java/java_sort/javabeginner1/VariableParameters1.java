package javabeginner1;

public class VariableParameters1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("import one parameter: ");
		Prints(1,"Nexus");
		System.out.println("\nimport two parameters: ");
		Prints(2,"MIUI","EMUI");
		System.out.println("\nimport five parameters: ");
		Prints(5,"Android","IOS","WebOS","WF","Flyme");
		System.out.println();
		String str1[]=new String[] {"MIUI","Flyme","EMUI","ColorOS","YunOS","360Os","HOS"};
		Prints(7,str1);
	}
	public static void Prints(int i,String...str) {
		System.out.print("import "+i+" parameters, they are: ");
		for(String s:str) {
			System.out.print(s+" ");
		}
	}

}
