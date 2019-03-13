package javabeginner5;

public class RuntimeDem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt=Runtime.getRuntime();
		System.out.println("the number of processors of JVM: "+rt.availableProcessors());
		System.out.println("the size of free memory of JVM: "+rt.totalMemory());
		System.out.println("the maximum of memory of JVM: "+rt.maxMemory());
		StringBuffer str=new StringBuffer();
		for(int i=0;i<1000;i++) {
			str=str.append(i);
		}
		System.out.println("After operatering str, the free memory of JVM: "+rt.freeMemory());
		rt.gc();
		System.out.println("After dealing with trash, the size of JVM's free memory: "+rt.freeMemory());
	}

}
