package com.javaex.ex05;

public class Depart extends Employee {

	// 코드작성
	private String depart;

	public Depart() {
		super();
	}

	public Depart(String depart) {
		super();
		this.depart = depart;
	}

	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	
	public void showInformation() {
		System.out.println("이름:"+super.getName()+"\t연봉:"+super.getSalary()+"\t부서:"+depart);
	}

}
