package ch10.collection02.hashMap02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManeger {
	private final int EMP_NUM = 100;
	// Employee의 자식 객체들을 저장
	private Map<String, Employee> empMap = new HashMap<>();
	private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0;
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 종료");
		System.out.print("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
	
	private RegularEmployee createRegularEmployee(){
		System.out.print("사번 >> ");
		String empNo = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary  = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp= new RegularEmployee(empNo, name, yearSalary, bonus);
		return emp;
	}
	
	private TempEmployee createTempEmployee(){
		System.out.print("사번 >> ");
		String empNo = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary  = sc.nextInt();
		System.out.print("계약 기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp= new TempEmployee(empNo, name, yearSalary, hireYear);
		return emp;
	}
	
	private PartTimeEmployee createPartTimeEmployee(){
		System.out.print("사번 >> ");
		String empNo = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일급 >> ");
		int dailyPay  = sc.nextInt();
		System.out.print("출근 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp= new PartTimeEmployee(empNo, name, dailyPay, workDay);
		return emp;
	}
	
	private void saveEmployee(Employee emp) {
		empMap.put(emp.empno, emp);
	}
	
	private void viewAllEmployeeInfo() {
		Set<Entry<String, Employee>> entrySet = empMap.entrySet();
		Iterator<Entry<String, Employee>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Employee> entry = entryIterator.next();
			entry.getValue().showEmployeeInfo();
		}
	}
	private void viewRegEmployeeInfo() {
		Set<Entry<String, Employee>> entrySet = empMap.entrySet();
		Iterator<Entry<String, Employee>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Employee> entry = entryIterator.next();
			if(entry.getValue() instanceof RegularEmployee) {
				entry.getValue().showEmployeeInfo();
			}
		}
	}
	private void viewTempEmployeeInfo() {
		Set<Entry<String, Employee>> entrySet = empMap.entrySet();
		Iterator<Entry<String, Employee>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Employee> entry = entryIterator.next();
			if(entry.getValue() instanceof TempEmployee) {
				entry.getValue().showEmployeeInfo();
			}
		}
	}
	private void viewPartEmployeeInfo() {
		Set<Entry<String, Employee>> entrySet = empMap.entrySet();
		Iterator<Entry<String, Employee>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Employee> entry = entryIterator.next();
			if(entry.getValue() instanceof PartTimeEmployee) {
				entry.getValue().showEmployeeInfo();
			}
		}
	}
	
	public void run() {
		boolean isRun = true;
		
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			
			switch(selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.REG_INFO:
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO:
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO:
				viewPartEmployeeInfo();
				break;
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			
			if(emp != null) {
				saveEmployee(emp);
			}
		}
		System.out.println("Program Exit...");
	}
}
