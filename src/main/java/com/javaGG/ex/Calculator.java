package com.javaGG.ex;

public class Calculator {
	
	public void add(int num1, int num2) {
		System.out.println("add �޼ҵ� ����");
		int rs = num1 + num2;
		System.out.println(num1 +  " + "  + num2 + " = " + rs + "\n");
	}
	
	public void sub(int num1, int num2) {
		System.out.println("sub �޼ҵ� ����");
		int rs = num1 - num2;
		System.out.println(num1 +  " - "  + num2 + " = " + rs + "\n");
	}
	
	public void multi(int num1, int num2) {
		System.out.println("multi �޼ҵ� ����");
		int rs = num1 * num2;
		System.out.println(num1 +  " * "  + num2 + " = " + rs + "\n");
	}
	
	public void div(int num1, int num2) {
		System.out.println("div �޼ҵ� ����");
		int rs = num1 / num2;
		System.out.println(num1 +  " / "  + num2 + " = " + rs + "\n");
	}
	
}
