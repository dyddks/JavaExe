package ch03.for10;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("369게임");
		System.out.print("숫자를 입력하세요 >>");
		int num = sc.nextInt();
		int clap= 0;
		if(num/10 == 3 || num/10 == 6 ||num/10 == 9) {
			clap+=1;
		}
		if(num%10 == 3 || num%10 == 6 ||num%10 == 9) {
			clap+=1;
		}
		
		if(clap == 1) {
			System.out.println("박수짝");
		}else if(clap == 2){
			System.out.println("박수짝짝");
		}
	}

}
