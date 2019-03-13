package javabeginner2;

class Code{
	{
		System.out.println("the constuctive code of Code");
	}
	static{
		System.out.println("the static code of Code");
	}
	public Code(){
		System.out.println("the constructive method of Code");
	}
}
public class Codeblock2 {
	{
		System.out.println("the code of Codeblock2");
	}
	static {
		System.out.println("the static code of Codeblock2");
	}
	public Codeblock2(){
		System.out.println("the method of Codeblock2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the main method of Codeblock2");
		new Code();
		new Codeblock2();
	}

}
