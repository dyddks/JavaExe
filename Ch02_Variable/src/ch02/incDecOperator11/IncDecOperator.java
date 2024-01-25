package ch02.incDecOperator11;

public class IncDecOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		num++; // num == 0
		System.out.println(num++); // num == 1
		num++; // num == 2
		System.out.println(++num); // num == 4
		
		num--; // num == 4
		System.out.println(num--); // num == 3
		num--; // num == 2
		System.out.println(--num); // num == 0
	}

}
