package ch10.collection02.hashMap04;

public abstract class Employee {
	String empno;
	String name;
	
	public Employee (String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	public void showEmployeeInfo() {
		System.out.println("------------------");
		System.out.println("empno: " + empno);
		System.out.println("name: " + name);
	}
	public abstract double getMonthPay();
	
	public void updateName(String name) {
		this.name = name;
	}
}
