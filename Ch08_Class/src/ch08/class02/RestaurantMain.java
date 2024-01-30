package ch08.class02;

import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 클래스도 자료형
		 * 우리가 직접 만든 사용자 정의 자료형
		 * 클래스 객체(클래스의 변수) = new(힙에 할당) 클래스의 생성자 함수 호출;
		 * */
		Scanner sc = new Scanner(System.in);
		Restaurant rest = new Restaurant();
		rest.sc = sc;
		rest.name = "새마을식당";
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		Restaurant rest1 = new Restaurant();
		rest1.sc = sc;
		rest1.name = "낙원타코";
		rest1.viewMenu();
		rest1.selectFood();
		rest1.deliveryFood();

		Restaurant rest2 = new Restaurant();
		rest2.sc = sc;
		rest2.name = "소호정";
		rest2.viewMenu();
		rest2.selectFood();
		rest2.deliveryFood();
	}

}
