package ch13.sec01;

/* Box<String> box1 = new Box<>();
 * Box<Integer> box2 = new Box<>();
 * 
 * 위 처럼 코드를 작성하면 아래처럼 컴파일러는 자동으로 2개의 클래스를 정의하게 된다. 
 * class Box_String {
 * 	public String content;
 * }
 * class Box_Integer {
 * 	public Integer content;
 * }
 * */
public class GenericExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();	// T == String
		box1.content = "안녕하세요";	// 박싱 : Heap -> Stack
		String str = box1.content;	// 언박싱 : Stack -> Heap 
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();	// T == Integer
		box2.content = 100;			// 박싱
		int value = box2.content;	// 언박싱
		System.out.println(value);
	}

}
