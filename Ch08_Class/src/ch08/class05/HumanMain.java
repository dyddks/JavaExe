package ch08.class05;

public class HumanMain {
	public static void view(Human human) {
		System.out.println("이름 : " + human.name);
		System.out.println("나이 : " + human.age);
		System.out.println("학점 : " + human.score);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human();
		
		human.name = "홍길동";
		human.age = 24;
		human.score = 4.5;
		
		view(human);
	}

}
