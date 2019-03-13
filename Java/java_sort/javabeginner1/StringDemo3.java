package javabeginner1;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java";
		String str2="Java is a programming language";
		System.out.println("Transform a into e in str1: "+str1.replace('a', 'e'));
		System.out.println("Transform Java into C++ in str2: "+str2.replaceAll(str1, "C++"));
		String strArray[]=str2.split("a");
		for(String s:strArray) {
			System.out.print(s+" ");
		}
		System.out.println("Subtract letters from tenth to the end in str2:\n"+str2.substring(10));
		System.out.println("Subtract letters from fifth to ninth in str2:\n"+str2.substring(5, 9));
		String str3="programming";
		String str4="LANGUAGE";
		System.out.println(str3+" to upper class: "+str3.toUpperCase());
		System.out.println(str4+" to lower class: "+str4.toLowerCase());
		System.out.println(str3+" "+str4);
		String str5="    Jaciy   ";
		System.out.println(str5+" delete the space: "+str5.trim());
		System.out.println(str1+"language"=="Java"+"language");
	}

}
