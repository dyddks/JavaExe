package ch09.abstract09;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resolve1_Add add = new Resolve1_Add();
		add.setValue(20,10);
		System.out.println(add.calculate());
		
		Resolve1_Sub sub = new Resolve1_Sub();
		sub.setValue(20,10);
		System.out.println(sub.calculate());
		
		Resolve1_Mul mul = new Resolve1_Mul();
		mul.setValue(20,10);
		System.out.println(mul.calculate());
		
		Resolve1_Div div = new Resolve1_Div();
		div.setValue(20,10);
		System.out.println(div.calculate());
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			Calc[] calcs = new Calc[] {add,sub,mul,div};
			System.out.print("입력:");
			int num0 = sc.nextInt();
			System.out.print("입력:");
			int num1 = sc.nextInt();
			System.out.print("연산선택 (0.add, 1.sub, 2.mul, 3.div): ");
			int sel = sc.nextInt();
			
			if(sel == 4) {
				break;
			}
			calcs[sel].setValue(num0, num1);
			System.out.println("연산결과: " + calcs[sel].calculate());
		}
				
		
		
	}

}
