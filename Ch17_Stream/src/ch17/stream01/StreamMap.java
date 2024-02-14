package ch17.stream01;

import java.util.Arrays;
import java.util.List;

class Customer{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public Customer setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Customer setAge(int age) {
		this.age = age;
		return this;
	}
	
	
}

public class StreamMap {
	public static void main(String[] args) {
		List<Customer> customerList = Arrays.asList(
				new Customer().setName("홍길동").setAge(24),
				new Customer().setName("임꺽정").setAge(33),
				new Customer().setName("장길산").setAge(34),
				new Customer().setName("일지매").setAge(52),
				new Customer().setName("차돌바위").setAge(26),
				new Customer().setName("머털이").setAge(35));
		
		/* map(mapping)
		 * 위도, 경도(숫자 2개) => 지도상의 위치
		 * */
		customerList.stream()
		.map(c->c.getName())
		.forEach(s->System.out.print(s + " "));
		
		customerList.stream()
		.map(c->c.getAge())
		.forEach(s->System.out.print(s + " "));
	};
	
	
}
