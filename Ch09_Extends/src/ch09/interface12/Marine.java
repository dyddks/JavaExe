package ch09.interface12;

public class Marine implements StarUnit {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("아장아장");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("두두두두");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("으악");
	}

}
