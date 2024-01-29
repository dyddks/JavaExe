package ch05.array08;

public class SwapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		a=b;
		b=a;
		
		System.out.printf("a=%d, b=%d\n", a, b);
		
		int num0 = 10;
		int num1 = 20;
		int tmp = 0;
		
		tmp = num0;
		num0 = num1;
		num1 = tmp;
		
		System.out.printf("num0=%d, num1=%d\n", num0, num1);
	}

}
