package ch10.collection02.linkedList03;

public class RegularEmployee extends Employee{
	int yearSalary;
	int bonus;
	
	public RegularEmployee(String empno, String name, int yearSalary, int bonus) {
		super(empno, name);
		// TODO Auto-generated constructor stub
		this.yearSalary = yearSalary;
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		double mPay = (double)(yearSalary+bonus)/12;
		return mPay;
	}
	@Override
	public void showEmployeeInfo() {
		//부모의 기능 + 추가 확장
		super.showEmployeeInfo(); // Employee의 show 호출
		System.out.println("bonus: " + bonus);
		System.out.printf("monthPay: %.2f\n", getMonthPay());
	}
	
	public void updateInfo(String name, int yearSalary, int bonus) {
		super.updateName(name);
		this.yearSalary = yearSalary;
		this.bonus = bonus;
	}
}
