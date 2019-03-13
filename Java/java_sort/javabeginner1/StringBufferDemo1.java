package javabeginner1;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strb1=new StringBuffer("Java");
		strb1.append(" is ");
		strb1.append("a ");
		strb1.append("language.");
		System.out.println(strb1);
		StringBuffer strb2=new StringBuffer();
		StringBuffer strb3=new StringBuffer(3);
		StringBuffer strb4=new StringBuffer("JavaScript");
		System.out.println("the capacity of strb1 is "+strb1.capacity()+" the length of strb1 is "+strb1.length());
		System.out.println("the capacity of strb2 is "+strb2.capacity()+" the length of strb2 is "+strb2.length());
		System.out.println("the capacity of strb3 is "+strb3.capacity()+" the length of strb3 is "+strb3.length());
		System.out.println("the capacity of strb4 is "+strb4.capacity()+" the length of strb4 is "+strb4.length());
		System.out.println("delete 5th to 11th of strb1: "+strb1.delete(5, 11));
		System.out.println("delete the single letter of strb1: "+strb1.deleteCharAt(2));
		System.out.println(strb4.insert(3, "&#$"));
		strb4.reverse();
		System.out.println(strb4);
		StringBuffer strb5=new StringBuffer("You are asshole!");
		strb5.setCharAt(2, 'y');
		System.out.println(strb5);
		strb5.setLength(7);
		System.out.println(strb5);
		StringBuffer strb6=new StringBuffer("tpircSa$#&vaJ");
		System.out.println("not to use toString(): ");
		if(strb4.equals(strb6)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		System.out.println("to use toString(): ");
		if(strb4.toString().equals(strb6.toString())) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}

}
