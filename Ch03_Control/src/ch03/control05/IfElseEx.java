package ch03.control05;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.탕수육");
		System.out.println("2.짬뽕");
		System.out.println("3.유산슬");
		System.out.println("4.짜장면");
		System.out.println("5.유린기");
		
		System.out.println("메뉴입력 >>");
		sel = sc.nextInt();
		
		if (sel == 1) {
			System.out.println("탕수육");
		} else if (sel == 2) {
			System.out.println("짬뽕");
		} else if (sel == 3) {
			System.out.println("유산슬");
		} else if (sel == 4) {
			System.out.println("짜장면");
		} else if (sel == 5) {
			System.out.println("유린기");
		} else {
			System.out.println("메뉴없음");
		}
			
		sc.close();
	}

}
