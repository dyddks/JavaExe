package ch08.class09;

import java.util.Scanner;

public class Buyer {
	Scanner sc;
	private int pearCnt;
	
	public Buyer() {
		sc = new Scanner(System.in);
	}
	
	public void buy(Mart mart) {
		System.out.print("지불할 액수를 입력해주세요. >> ");
		int money = sc.nextInt();
		pearCnt = mart.salePear(money);
		
	}
	
	public void showBuyResult() {
		System.out.println("배를 " + pearCnt + "개 구매했습니다.");
	}
}
