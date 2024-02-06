package ch10.collection01.ch15.sec03.exam01;

import java.util.*;

/* Set은 집합이다.
 * 집합은 데이터의 모음일 뿐 '순서가 보장되지 않는다'
 * 그러므로 중복을 허용하지 않는다.
 * A = {1, 2, 3}
 * B = {3, 4, 5}
 * A⋃B = {1, 2, 3, 4, 5}
 * 
 * 데이터가 입력될 때 기존 데이터가 있는지 확인한다.
 * 이때 사용하는 알고리즘이 Hash알고리즘이다.
 * */
public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");	// 중복객체이므로 저장하지 않음
		set.add("Spring");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
		
		for(String element: set) {
			System.out.println(element);
		}
	}

}
