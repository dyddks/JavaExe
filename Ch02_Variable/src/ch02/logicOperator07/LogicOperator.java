package ch02.logicOperator07;

public class LogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean logic;
		
		// AND
		logic = true && true;
		System.out.println("true && true => " + logic);
		logic = true && false;
		System.out.println("true && false => " + logic);
		
		// OR
		logic = true || true;
		System.out.println("true || true => " + logic);
		logic = true || false;
		System.out.println("true || false => " + logic);
		
		// XOR
		logic = true ^ true;
		System.out.println("true ^ true => " + logic);
		logic = true ^ false;
		System.out.println("true ^ false => " + logic);
		
		// NOT
		logic = !false;
		System.out.println("!false => " + logic);
	}

}
