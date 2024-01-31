package ch09.extends05;

public class Child extends Father{
	private float day;
	
	Child(){
		System.out.println("Child 생성자");
	}
	Child(int score, long money, float day){
		super(score, money);
		this.day = day;
		System.out.println("Child 매개변수 생성자");
	}
	void play() {
		System.out.println("잘놈");
	}
}
