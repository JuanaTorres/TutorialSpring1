package com.demo.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Word;

public class App {
	public static void main(String[] arg) {

		ApplicationContext appc= new ClassPathXmlApplicationContext("com/demo/xml/beans.xml");
		Word w= appc.getBean(Word.class);
		
		System.out.println(w.getMessage());
		
	}
}
