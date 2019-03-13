package javabeginner9;

import java.lang.reflect.Array;
import javabeginner7.RanStrNum;

public class ArrayDemo1 {
	public static final void println(Object obj) {
		System.out.println(obj);
	}
	public static final void print(Object obj) {
		System.out.print(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RanStrNum r1=new RanStrNum();
		int num[]= {1,2,3,4,5};
		Class<?>cArray=num.getClass().getComponentType();
		println("the type of the element: "+cArray.getName());
		println("the length of the array: "+Array.getLength(num)+"\t"+num.length);
		println("before modified: ");
		for(int i=0;i<num.length;i++) {
			print(Array.get(num, i)+" ");
		}
		println("\nafter modified: ");
		for(int i=0;i<Array.getLength(num);i++) {
			Array.set(num, i, i*2+1);
			print(Array.get(num, i)+" ");
		}
		String str[]=null;
		try {
			str=(String[])Array.newInstance(String.class, 5);
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<Array.getLength(str);i++) {
			Array.set(str, i, r1.randStrLetter(i+1));
		}
		println("\nthe content of Array: ");
		for(String str1:str) {
			print(str1+" ");
		}
	}

}
