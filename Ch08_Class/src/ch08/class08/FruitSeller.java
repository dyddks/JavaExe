package ch08.class08;

public class FruitSeller {
	private int numOfApple;
	private int saleMoney;
	final int APPLE_PRICE = 1000;
	
	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		saleMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + saleMoney);
	}
}
