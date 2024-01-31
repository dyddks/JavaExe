package ch09.extends02;

public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.hansome();
		child.wealth();
		child.play();
		
		System.out.println("잘생김점수: " + child.handsomeScore);
		System.out.println("재산: " + child.money);
		System.out.println("노는날: " + child.day);
	}

}
