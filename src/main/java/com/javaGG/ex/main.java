package com.javaGG.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
//		MyCalculator myCal = new MyCalculator();//Mycalculator 변수 선언
//		
//		myCal.setcal(new Calculator());//Mycalculator 변수에 Calculator 데이터를 넣어줌		
//		myCal.setnum1(10);
//		myCal.setnum2(5);
//		
//		myCal.addition(); //Mycalculator를 의존해서 데이터를 Calculator에서 가져옴
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
