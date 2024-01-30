package ch08.class08;

/* <class와 class간의 상호작용>
 * 요구사항 : "과일구매자는 과일 판매자한테 사과 2개를 구매했다."
 * 			이것을 객체지향 프로그래밍으로 묘사하라
 * 1) 명사/동사 분류법
 * 	명사: 클래스(상위개념)
 * 		필드(하위개념)
 * 	동사: 메소드
 * 		연관성있는 역할의 메소드가 많으면 클래스로 묶는다.
 * 
 * 2) MVC(역할)
 * 	Model : 데이터베이스 제어(Dao)
 * 	View : 화면, 입출력
 * 	Controller : 중간연결, 비지니스로직, 통신
 * 
 * 	Vo : 필드를 묶어놓은 개념
 * 	Dto : MVC간에 메시지를 주고 받을 때 묶어서 전달
 * 
 * 클래스 : 설계도
 * 객체 : 설계도로 만들어진 실체(object, instance)
 * */
public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitSeller fs = new FruitSeller(20);
		FruitBuyer fb = new FruitBuyer(10000);
		
		fs.showSaleResult();
		fb.showBuyResult();
		
		fb.buyApple(fs, 2000);
		
		fs.showSaleResult();
		fb.showBuyResult();
	}

}
