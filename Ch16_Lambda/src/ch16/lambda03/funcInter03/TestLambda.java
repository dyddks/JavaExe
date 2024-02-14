package ch16.lambda03.funcInter03;

@FunctionalInterface
interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString reStr = returnString();
		reStr.showString("hello");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world");
	}
}
