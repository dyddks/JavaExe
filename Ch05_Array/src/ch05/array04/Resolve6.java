package ch05.array04;

import java.util.Scanner;

public class Resolve6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] grade = new int[5];
		
		for(int i=0; i<name.length; i++) {
			System.out.print("이름>> ");
			name[i] = sc.next();
			System.out.print("점수>> ");
			grade[i] = sc.nextInt();
		}
		
		for(int i=0; i<name.length; i++) {
			System.out.print("이름>> " + name[i]+" ");
			if(grade[i] >= 90) {
				System.out.print("점수>> A");
			}else if(grade[i] >= 80) {
				System.out.print("점수>> B");
			}else if(grade[i] >= 70) {
				System.out.print("점수>> C");
			}else if(grade[i] >= 60) {
				System.out.print("점수>> D");
			}else {
				System.out.print("점수>> F");
			}
			System.out.println();
		}
	}

}
