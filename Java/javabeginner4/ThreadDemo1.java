package javabeginner4;

public class ThreadDemo1 extends Thread{
	//private String name;
	public ThreadDemo1() {};
	public ThreadDemo1(String name) {
		setName(name);
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("the running thread: "+getName()+", i="+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 t1=new ThreadDemo1("Thread--1");
		ThreadDemo1 t2=new ThreadDemo1("Thread--2");
		t1.start();
		t2.start();
	}

}
