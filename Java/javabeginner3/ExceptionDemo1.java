package javabeginner3;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]= {1,2,3};
		try {
			System.out.println("i[0]="+i[0]);
			System.out.println("i[3]="+i[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Information: "+e);
		}finally {
			System.out.println("No matter what happens, it will be carried out.");
		}
		System.out.println("i[1]="+i[1]);
	}

}
