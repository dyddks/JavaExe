package ch09.resolve14;

public class InkPrinter extends PrinterInfo{
	int inkCnt;
	
	public InkPrinter(String model, String manufacturer, String interfaceType, int paperCnt, int inkCnt) {
		super(model, manufacturer, interfaceType, paperCnt);
		this.inkCnt = inkCnt;
	}

	@Override
	public void print() {
		super.print();
		this.inkCnt -= 1;
		System.out.println("잉크젯프린터 인쇄완료");
	}
	
	public void viewPrinterInfo() {
		super.viewPrinterInfo();
		System.out.println("잉크 잔량: " + inkCnt);
	}
}
