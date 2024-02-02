package ch09.resolve14;

public abstract class PrinterInfo {
	private String model;
	private String manufacturer;
	private String interfaceType;
	private int printCnt;
	private int paperCnt;
	
	public PrinterInfo(String model, String manufacturer, String interfaceType, int paperCnt) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.interfaceType = interfaceType;
		this.printCnt = 0;
		this.paperCnt = paperCnt;
	}
	public void viewPrinterInfo() {
		System.out.println("모델: " + model);
		System.out.println("제조사: " + manufacturer);
		System.out.println("인터페이스 타입: " + interfaceType);
		System.out.println("인쇄매수: " + printCnt);
		System.out.println("종이 잔량: " + paperCnt);
	}
	
	public void print() {
		this.paperCnt -= 1;
		this.printCnt += 1;
	};
	
}
