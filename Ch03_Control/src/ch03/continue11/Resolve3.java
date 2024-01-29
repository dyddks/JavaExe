package ch03.continue11;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int saving = 0;

		while(true) {
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.print("선택> ");
			String num = sc.nextLine();
			
			if(num.equals("1")) {
				System.out.print("예금액> ");
				saving += Integer.parseInt(sc.nextLine());
			}else if(num.equals("2")) {
				System.out.print("출금액> ");
				int withdraw = Integer.parseInt(sc.nextLine());
				saving -= withdraw;
			}else if(num.equals("3")) {
				System.out.println("잔고> " + saving);
			}else if(num.equals("4")) {
				System.out.println("종료");
				break;
			}
		}
	}

}
