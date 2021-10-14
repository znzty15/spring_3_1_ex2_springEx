package com.javaGG.ex;

public class MyCalculator {
	
	Calculator cal; //Calculator 변수 선언
	private int num1;
	private int num2;
	
	public MyCalculator() {
		
	}

	public void addition() {
		cal.add(num1, num2); //Calculator 메소드 호출
	}
	
	public void subtraction() {
		cal.sub(num1, num2);
	}
	
	public void multiplication() {
		cal.multi(num1, num2);
	}
	
	public void division() {
		cal.div(num1, num2);
	}

	public void setcal(Calculator cal) {
		this.cal = cal;
	}

	public void setnum1(int num1) {
		this.num1 = num1;
	}

	public void setnum2(int num2) {
		this.num2 = num2;
	}
	
	
}
