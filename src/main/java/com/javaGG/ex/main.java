package com.javaGG.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
//		MyCalculator myCal = new MyCalculator();//Mycalculator ���� ����
//		
//		myCal.setcal(new Calculator());//Mycalculator ������ Calculator �����͸� �־���		
//		myCal.setnum1(10);
//		myCal.setnum2(5);
//		
//		myCal.addition(); //Mycalculator�� �����ؼ� �����͸� Calculator���� ������
//		myCal.subtraction();
//		myCal.division();
		
		String congifLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(congifLocation);
		ctx.getBean("myCal", MyCalculator.class);
		myCal.
		myCal.subtraction();
		myCal.division();		
		
	}

}
