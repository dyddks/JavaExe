package ch09.resolve14;

public class PrinterMain {

	public static void main(String[] args) {
		PrinterInfo[] print = new PrinterInfo[] {
				new InkPrinter("S-103", "삼성", "USB", 10, 10),
				new LaserPrinter("L-103", "LG", "paraller port", 10, 10)};

		for(int i=0; i<print.length; i++) {
			print[i].viewPrinterInfo();
			print[i].print();
			print[i].viewPrinterInfo();
			System.out.println("-----------------------");
		}
	}

}
