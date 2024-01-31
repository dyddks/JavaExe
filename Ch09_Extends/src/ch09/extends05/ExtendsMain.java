package ch09.extends05;

/* [Java 접근 제한자]
 * 1) public: 누구라도 접근 가능
 * 2) protected: 같은 패키지 클래스 접근 가능 + 패키지가 달라도 자식 클래스는 접근 가능
 * 3) default: 접근 제한자를 쓰지 않았을때, 같은 패키지에 있는 클래스만 접근 가능
 * 4) private: 클래스 내에서만 나만 가능, 자식도 접근 불가능
 * */
public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child(7, 999999999L, 72);
		child.hansome();
		child.wealth();
		child.play();
		
		// private이라 자식클래스라도 접근못함
//		System.out.println("잘생김점수: " + child.handsomeScore);
//		System.out.println("재산: " + child.money);
//		System.out.println("노는날: " + child.day);
	}

}
