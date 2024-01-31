package ch09.extends03;

public class Father extends GrandFather{
	long money = 999999999999999999L;
	
	Father(){
		System.out.println("Father 생성자");
	}
	void wealth() {
		System.out.println("돈잘범");
	}
}
