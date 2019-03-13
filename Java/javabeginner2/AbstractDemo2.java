package javabeginner2;
import javabeginner2.Shape;
class Rectangle extends Shape{
	public Rectangle() {};
	public Rectangle(float width,float high) {
		super(width,high);
	}
	public void Area() {
		System.out.println("the area of rectangle: "+(getWidth()*getHigh()));
	}
	public void Circumference() {
		System.out.println("the circumference of rectangle: "+((getWidth()+getHigh())*2));
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec=new Rectangle(5.13f,3.67f);
		rec.Area();
		rec.Circumference();
	}

}
