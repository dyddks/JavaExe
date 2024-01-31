package ch08.class09;

public class Resolve1_Restourant {
	private String[] menu = {"짜장면", "짬뽕", "탕수육"};
	
	public Resolve1_Restourant() {
		for(int i=0; i<menu.length; i++) {
			System.out.println(i+1 + "." + menu[i]);
		}
	}
	
	public void deliveryFood(int menuNum) {
		System.out.println("주문하신" + menu[menuNum-1]+ "나왔습니다.");
	}
}
