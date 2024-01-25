package ch03.for10;

import java.util.Scanner;

public class Resolve1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요: ");
		int money = sc.nextInt();
		int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0, i=0;
		
		
		a = money / 50000;
		money %= 50000;
	
		b = money / 10000;
		money %= 10000;
	
		c = money / 5000;
		money %= 5000;
	
		d = money / 1000;
		money %= 1000;
	
		e = money / 500;
		money %= 500;
	
		f = money / 100;
		money %= 100;
	
		g = money / 50;
		money %= 50;

		h = money / 10;
		money %= 10;

		i = money;
		
		System.out.println("오만원: " + a);
		System.out.println("만원: "+ b);
		System.out.println("오천원: "+ c);
		System.out.println("천원: "+ d);
		System.out.println("오백원: "+ e);
		System.out.println("백원: "+ f);
		System.out.println("오십원: "+ g);
		System.out.println("십원: "+ h);
		System.out.println("일원: "+ i);
	}

}
