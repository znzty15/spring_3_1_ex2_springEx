package com.javaGG.ex;

public class Calculator {
	
	public void add(int num1, int num2) {
		System.out.println("add 메소드 실행");
		int rs = num1 + num2;
		System.out.println(num1 +  " + "  + num2 + " = " + rs + "\n");
	}
	
	public void sub(int num1, int num2) {
		System.out.println("sub 메소드 실행");
		int rs = num1 - num2;
		System.out.println(num1 +  " - "  + num2 + " = " + rs + "\n");
	}
	
	public void multi(int num1, int num2) {
		System.out.println("multi 메소드 실행");
		int rs = num1 * num2;
		System.out.println(num1 +  " * "  + num2 + " = " + rs + "\n");
	}
	
	public void div(int num1, int num2) {
		System.out.println("div 메소드 실행");
		int rs = num1 / num2;
		System.out.println(num1 +  " / "  + num2 + " = " + rs + "\n");
	}
	
}
