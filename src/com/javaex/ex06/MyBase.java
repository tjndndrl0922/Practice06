package com.javaex.ex06;

public class MyBase extends Base {

	// 코드작성

	/*
	 * public void day() { System.out.println("낮에는 열심히 수업듣자"); }
	 * 
	 * public void night() { System.out.println("밤에는 숙면"); }
	 * 
	 * 
	 * public void service(String state) {
	 * 
	 * switch (state) { case "낮": day(); break;
	 * 
	 * case "밤": night(); break;
	 * 
	 * default: System.out.println("오후도 낮과 마찬가지로 공부해야합니다."); break; } }
	 */

	public void service(String state) {
		if (state.equals("오후")) {
			afternoon();
		} else {
			super.service(state);
		}
	}

	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}

}
