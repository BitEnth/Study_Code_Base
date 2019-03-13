package javabeginner7;

import java.util.*;

public class ListTest1 {
	private  String strInput;
	public void scanInput() {
		System.out.println("Please input what you want: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		strInput=new String(scan.nextLine());
		return;
	}
	public void toArrayList1() {
		List<String>list=Arrays.asList(strInput);
		ArrayList<String>arrList=new ArrayList<String>(list);
		this.showList(arrList);
	}
	public void toArrayList2() {
		char cString[]=strInput.toCharArray();
		ArrayList<Character>arrList=new ArrayList<Character>();
		for(char c:cString) {
			arrList.add(c);
		}
		this.showList(arrList);
	}
	public void showList(ArrayList<?> arrList) {
		Iterator<?>it=arrList.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		System.out.println(arrList.size());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTest1 lt1=new ListTest1();
		lt1.scanInput();
		lt1.toArrayList1();
		lt1.toArrayList2();
	}

}
