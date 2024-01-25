package ch03.for10;

import java.util.Scanner;

public class Resolve15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int num = sc.nextInt();
			if(num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);
	}

}
