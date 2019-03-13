package javabeginner1;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String taste[]=new String[] {"sour","sweet","bitter","spicy"};
		for(int i=0;i<4;i++) {
			System.out.print(taste[i]+"\t");
		}
		System.out.println();
		System.out.println(taste);
		String names[]=null;
		names=new String[] {"Calson","Teddy","Dicky","Flory","Garry","Murphy","Robbin","Corso","Incore","Perrt"};
		int len=names.length;
		for(int j=0;j<len;j++) {
			System.out.print(names[j]+"\t");
		}
		System.out.println("\nnames array has "+len+" elements");
	}

}
