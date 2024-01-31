package ch08.class09;

public class Mart {
	private int pearCnt;
	private final int PEAR_PRICE = 2500;
	
	public Mart(int pearCnt) {
		this.pearCnt = pearCnt;
		System.out.println("남아있는 배 개수:" + this.pearCnt);
	}
	public int salePear(int money) {
		int num = money/PEAR_PRICE;
		if(pearCnt < num) {
			System.out.println("배의 개수가 부족합니다.");
			return 0;
		}
		return num;
	}
}
