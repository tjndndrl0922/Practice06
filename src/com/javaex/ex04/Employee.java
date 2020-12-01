package com.javaex.ex04;

public class Employee extends User {

	private int salary;

	public Employee() {
		super();
	}

	public Employee(int salary) {
		super();
		this.salary = salary;
	}

	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void showInfo() {
		System.out.println("#아이디: "+super.getId()+", #패스워드:"+super.getPassword()+", #이름:"+super.getName()+", #월급:"+salary);
		System.out.println("운영자의 월급은 50000000원 입니다.");
	}
	

}
