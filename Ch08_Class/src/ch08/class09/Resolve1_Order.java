package ch08.class09;

import java.util.Scanner;

public class Resolve1_Order {
	private int menuNum;
	private Scanner sc;
	
	public Resolve1_Order() {
		sc = new Scanner(System.in);
	}
	
	public void order() {
		System.out.println("메뉴를 선택해주세요(1~3)");
		menuNum = sc.nextInt();
	}
	
	public int getMenuNum() {
		return this.menuNum;
	}
}
