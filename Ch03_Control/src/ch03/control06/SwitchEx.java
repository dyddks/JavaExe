package ch03.control06;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sel;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("봄");
		System.out.println("여름");
		System.out.println("가을");
		System.out.println("겨울");
		
		System.out.println("봄,여름,가을,겨울 중 입력 >>");
		sel = sc.nextLine();
		
		switch (sel) {
		case "봄": 
			System.out.println("새싹이 자라난다");
			break;
		case "여름": 
			System.out.println("산과 바다로 가자");
			break;
		case "가을": 
			System.out.println("책을 읽자");
			break;
		case "겨울": 
			System.out.println("스키장에 간다");
			break;
	}
			
		sc.close();
	}

}
