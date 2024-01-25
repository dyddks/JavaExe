package ch03.for10;

import java.util.Scanner;

public class Resolve14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}

}
