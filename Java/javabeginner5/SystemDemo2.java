package javabeginner5;

public class SystemDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char src[]= {'A','B','C','D','E','F','G','H','I','J'};
		char dest[]= {'1','2','3','4','5','6','7','8','9','0'};
		long result=0;
		System.arraycopy(src, 3, dest, 4, 5);
		for(char c:dest) {
			System.out.print(c+" ");
		}
		System.out.println();
		long startTime=System.currentTimeMillis();
		for(long i=1;i<8888888888L;i++) {
			result=result+i;
		}
		System.out.println("the time of running: "+(System.currentTimeMillis()-startTime)+" ms.");
		System.out.println("result="+result);
	}

}
