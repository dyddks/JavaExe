package ch09.abstract09;

/* [추상클래스]
 * 일부는 구현
 * 1개라도 메서드가 미수현(추상메서드)되면 추상클래스
 * 설계 목적, 상속을 전제
 * */
public abstract class Calc {
	int a;
	int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	// 추상메서드(자식이 상속받아서 구현해야함)
	public abstract int calculate();
}
