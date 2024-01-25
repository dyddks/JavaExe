package ch03.control07;

public class SwitchExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		// 표현식을 이용한 switch문
		switch(grade ) {
			case 'A', 'a' -> {
				System.out.println("우수회원");
			}
			case 'B', 'b' -> {
				System.out.println("일반회원");
			}
			default -> {
				System.out.println("손님");
			}
		}
		
		// 중괄호 생략
		switch(grade) {
			case 'A', 'a' -> System.out.println("우수회원");
			case 'B', 'b' -> System.out.println("일반회원");
			default -> System.out.println("손님");
		}
	}

}
