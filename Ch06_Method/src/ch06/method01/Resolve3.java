package ch06.method01;

public class Resolve3 {
	
	public static int total(int a, int b) {
		int total=0;
		for(int i=a; i<=b; i++) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 100;
		int result = total(a, b);
		System.out.printf("%d부터 %d까지의 누적합: %d", a, b, result);
	}

}
