package ch07.enum01.ch05.sec12;

import java.util.Scanner;

public class SwitchEx {

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
		
		switch (sel) {
			case Menu.TANGSUYUK: 
				System.out.println("탕수육");
				break;
			case Menu.ZZAMPONG: 
				System.out.println("짬뽕");
				break;
			case Menu.YOUSANSUL: 
				System.out.println("유산슬");
				break;
			case Menu.ZZAJANGMYUN: 
				System.out.println("짜장면");
				break;
			case Menu.YOULINGI: 
				System.out.println("유린기");
				break;
			default:
				System.out.println("메뉴없음");
				break;
		}
			
		sc.close();
	}

}
