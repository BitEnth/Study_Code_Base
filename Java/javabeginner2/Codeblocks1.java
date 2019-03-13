package javabeginner2;

public class Codeblocks1 {
	{
		System.out.println("the first codeblock");
	}
	public Codeblocks1(){
		System.out.println("constructive codeblock");
	}
	{
		System.out.println("the second codeblock");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int x=3;
			System.out.println("1. a variable parameter of ordinary codeblocks x="+x);
		}
		int x=5;
		System.out.println("a variable parameter of main method x="+x);
		{
			int y=7;
			System.out.println("2. a variable parameter of ordinary codeblocks y="+y);
		}
		new Codeblocks1();
	}

}
