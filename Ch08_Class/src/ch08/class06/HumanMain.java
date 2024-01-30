package ch08.class06;

public class HumanMain {
	public static void view(Human human) {
		System.out.println("이름 : " + human.getName());
		System.out.println("나이 : " + human.getAge());
		System.out.println("학점 : " + human.getScore());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human();
		
		human.setName("홍길동");
		human.setAge(24);
		human.setScore(4.5);
		
		view(human);
		
		/* 중간에 많은 처리가 있다.
		 * 그러다 age나 score값에 음수가 들어갔다.
		 **/
		human.setAge(-10);
		human.setScore(-20.9);
	}

}
