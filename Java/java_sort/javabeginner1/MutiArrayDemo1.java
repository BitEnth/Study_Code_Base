package javabeginner1;

public class MutiArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[][]=new String[4][2];
		names=new String[][] {{"Carlson","Alphabet"},{"Eric","Murphy"},{"Alice","Elizabeth"},{"Querty","Uink"}};
		for(int row=0;row<names.length;row++) {
			for(int column=0;column<names[row].length;column++) {
				System.out.println("names ["+row+"] ["+column+"]: "+names[row][column]);
			}
		}
	}

}
