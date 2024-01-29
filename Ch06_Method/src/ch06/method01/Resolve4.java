package ch06.method01;

public class Resolve4 {

	public static void gugudan(int dan) {
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan(3);
	}

}
