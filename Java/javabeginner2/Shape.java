package javabeginner2;

public abstract class Shape {
	private float width;
	private float high;
	public Shape() {};
	public Shape(float width,float high) {
		this.width=width;
		this.high=high;
	}
	public void setWidth(float width) {
		this.width=width;
	}
	public float getWidth() {
		return width;
	}
	public void setHigh(float high) {
		this.high=high;
	}
	public float getHigh() {
		return high;
	}
	public abstract void Area();
	public abstract void Circumference();
}
