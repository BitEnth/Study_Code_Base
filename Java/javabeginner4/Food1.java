package javabeginner4;

public class Food1 {
	private int number=0;
	private String food=null;
	public Food1() {}
	public Food1(String food,int number) {
		this.food=food;
		this.number=number;
	}
	public synchronized void setFood(int n) {
		if(this.number!=0) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		number=n;
		System.out.println("Set "+this.food+" Number "+this.number+" throng food");
		notify();
	}
	public synchronized String getFood() {
		if(this.number==0) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\tGet Number "+this.number+" throng "+this.food);
		this.number=0;
		notify();
		return food+number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food1 f=new Food1("Ham",0);
		SetFood sf=new SetFood(f);
		GetFood gf=new GetFood(f);
		new Thread(sf).start();
		new Thread(gf).start();
	}

}

class SetFood implements Runnable{
	private Food1 food1;
	public SetFood() {}
	public SetFood(Food1 food1) {
		this.food1=food1;
	}
	public void run() {
		for(int n=1;n<=5;n++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			food1.setFood(n);
		}
	}
}

class GetFood implements Runnable{
	private Food1 food1;
	public GetFood() {}
	public GetFood(Food1 food1) {
		this.food1=food1;
	}
	public void run() {
		for(int n=1;n<=5;n++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			food1.getFood();
		}
	}
}
