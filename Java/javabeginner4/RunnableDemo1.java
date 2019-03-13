package javabeginner4;

public class RunnableDemo1 implements Runnable{
	private String name;
	public RunnableDemo1() {}
	public RunnableDemo1(String name) {
		setName(name);
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo1 r1=new RunnableDemo1("Thread--1");
		RunnableDemo1 r2=new RunnableDemo1("Thread--2");
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r1);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			System.out.println("the running thread: "+getName()+", i="+i);
		}
	}

}
