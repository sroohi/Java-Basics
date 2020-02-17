package com.big.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.big.sean.BigSean;

public class MainApp {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("bigshit.xml");

		BigSean bf = (BigSean) ctx.getBean("bigF");
		System.out.println(bf.toString());
	}

}
