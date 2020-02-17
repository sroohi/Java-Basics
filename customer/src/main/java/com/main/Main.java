package com.main;

import java.applet.AppletContext;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

	Application ctx = new ClassPathXmlApplicationContext("app-context.xml");
		
	}

}
