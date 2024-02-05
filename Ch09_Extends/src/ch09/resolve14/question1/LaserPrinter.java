package ch09.resolve14.question1;

public class LaserPrinter extends PrinterInfo{
	private int tonerCnt;
	
	public LaserPrinter(String model, String manufacturer, String interfaceType, int paperCnt, int tonerCnt) {
		super(model, manufacturer, interfaceType, paperCnt);
		this.tonerCnt = tonerCnt;
	}

	@Override
	public void print() {
		super.print();
		this.tonerCnt -= 1;
		System.out.println("레이저프린터 인쇄완료");
	}
	
	public void viewPrinterInfo() {
		super.viewPrinterInfo();
		System.out.println("토너 잔량: " + tonerCnt);
	}
}
