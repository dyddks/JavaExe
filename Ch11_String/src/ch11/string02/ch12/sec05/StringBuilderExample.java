package ch11.string02.ch12.sec05;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		String data = new StringBuilder()
		.append("DEF")
		.insert(0, "ABC")
		.delete(3, 4)
		.toString();
		System.out.println(data);

	}

}
class MyStringBuilder{
	private List<Character> chList = new ArrayList<>();
	
	public MyStringBuilder append(String str) {
		char[] chArr = str.toCharArray();
		for(char ch: chArr) {
			chList.add(ch);
		}
		return this;
	}
	public MyStringBuilder insert(int idx, String str) {
		char[]chArr = str.toCharArray();
		for(int i=idx; i<idx+str.length(); i++) {
			chList.add(i, chArr[i]);
		}
		return this;
	}
}