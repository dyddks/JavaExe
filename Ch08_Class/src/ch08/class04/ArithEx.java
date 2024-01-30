package ch08.class04;

/* static메소드는 객체를 만들지 않아도 바로 사용가능하다.
 * 일반 메소드는 객체를 만들어서 호출해야한다.
 * */
public class ArithEx {
	public static void main(String[] args) {
		int a=10, b=5;
		int result=0;
		Arith arith = new Arith();
		
		result = arith.add(a, b);
		System.out.println(result);
		result = arith.sub(a, b);
		System.out.println(result);
		result = arith.mul(a, b);
		System.out.println(result);
		result = arith.div(a, b);
		System.out.println(result);
	}
}
