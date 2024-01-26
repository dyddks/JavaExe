package ch03.continue11;

public class Resolve1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=100;i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println("3의배수의 총합: " + sum);
	}

}
