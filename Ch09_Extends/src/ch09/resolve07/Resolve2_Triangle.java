package ch09.resolve07;

public class Resolve2_Triangle {
	int width;
	int hight;
	
	public Resolve2_Triangle(int width, int hight) {
		this.width = width;
		this.hight = hight;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public double area() {
		return (double)width*hight/2;
	}
}
