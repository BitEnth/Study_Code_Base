package javabeginner5;

public class MathDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Absolute Function: 10.02="+Math.abs(10.02D)+", -10.02="+Math.abs(-10.02D));
		System.out.println("The maxmium and minmuim of 23, 12. the maxmuim is:  "+Math.max(23, 12)+" the minmuim is "+Math.min(23, 12));
		System.out.println("Round: 13.67="+Math.round(13.6f)+", 13.4="+Math.round(13.4f));
		System.out.println("Triangle Function: sin(30)="+Math.sin(Math.toRadians(30))+", cos(30)="+Math.cos(30)+",tan(30)="+Math.tan(30));
		System.out.println("Squart Function: 16^½="+Math.sqrt(16)+", 8^⅓="+Math.cbrt(8));
		System.out.println("Logarithm Function: ln(10)="+Math.log(10));
		System.out.println("Random number between zero to ten: "+Math.random()*10);
	}

}
