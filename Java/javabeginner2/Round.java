package javabeginner2;
import javabeginner2.InterShape;
import javabeginner2.Shape;
public class Round extends Shape implements InterShape {
	private float radius;
	private double area1;
	private double circum1;
	public Round() {};
	public Round(float radius) {
		setRadius(radius);
	}
	public void setRadius(float radius) {
		this.radius=radius;
	}
	public float getRadius() {
		return radius;
	}
	public void Area() {
		this.area1=getRadius()*getRadius()*PI;
	}
	public void Circumference() {
		this.circum1=2*getRadius()*PI;
	}
	public void getArea() {
		System.out.println("the area of the round is: "+area1);
	}
	public void getCircum() {
		System.out.println("the circumference of the round is: "+circum1);
	}
}
