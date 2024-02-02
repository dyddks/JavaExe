package ch09.interface12;

public class Hydra implements StarUnit {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("스물스물");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("퉤퉤");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("크아악");
	}

}
