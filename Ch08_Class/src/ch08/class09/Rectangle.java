package ch08.class09;

import java.util.Arrays;

public class Rectangle {
	private int[] x;
	private int[] y;
	private int area;
	public Rectangle() {
		x = new int[2];
		y = new int[2];
	}
	public void set(int x1, int y1, int x2, int y2) {
		if(x1==x2 || y1==y2) {
			System.out.println("사각형이 아닙니다.");
			return;
		}
		this.x[0] = x1;
		this.y[0] = y1;
		this.x[1] = x2;
		this.y[1] = y2;
	}
	public int[] getX() {
		return x;
	}
	public int[] getY() {
		return y;
	}
	public int square() {
		return area = Math.abs(x[0]-x[1])*Math.abs(y[0]-y[1]);
	}
	public void show() {
		System.out.println("사각형을 이루는 두점의 좌표");
		System.out.printf("(%d, %d) (%d, %d)\n", x[0], y[0], x[1], y[1]);
		System.out.println("직사각형의 넓이 : " + area);
	}
	public boolean equals(Rectangle r) {
		Arrays.sort(x);
		Arrays.sort(r.getX());
		Arrays.sort(y);
		Arrays.sort(r.getY());
		
		if(Arrays.equals(x, r.getX()) && Arrays.equals(y, r.getY())) {
			return true;
		}
		return false;
	}
	
}
