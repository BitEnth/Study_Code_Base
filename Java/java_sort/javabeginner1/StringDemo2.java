package javabeginner1;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java";
		System.out.println("Before change: "+str);
		str+="language";
		System.out.println("After change: "+str);
		String str1="Hello world";
		char cString=str1.charAt(5);
		System.out.println(str1+" the sixth letter is "+cString);
		System.out.println("whether "+str1+" begins with a letter: "+str1.startsWith(str1));
		System.out.println("whether "+str1+" ends with a letter: "+str1.endsWith(str1));
		String strLower="fucking asshole";
		String strUpper="FUCKING ASSHOLE";
		System.out.println("use equals(): "+strLower+" & "+strUpper+" is "+strLower.equals(strUpper));
		System.out.println("use equalsIgnoreCase(): "+strLower+" & "+strUpper+" is "+strLower.equalsIgnoreCase(strUpper));
		String str2="What the fucking bullshit damn bitch?!";
		char cstr1[]=str2.toCharArray();
		for(char c:cstr1) {
			System.out.print(c);
		}
		String str2char=String.valueOf(cstr1);
		System.out.println("\n"+str2char);
		byte str2byte[]=str2.getBytes();
		System.out.println(new String(str2byte));
		System.out.println(new String(str2byte,1,6));
		System.out.println("whether ing exits in "+str2+" :\n"+str2.indexOf("ing"));
		System.out.println("whether z exits in "+str2+" :\n "+str2.indexOf("z"));
		System.out.println("the length of "+str2+" is\n"+str2.length());
	}

}
