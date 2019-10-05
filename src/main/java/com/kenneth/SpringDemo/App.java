package com.kenneth.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// BeanFactory factory1 = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));

		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		Alien obj = factory.getBean("navinAlien", Alien.class);

		obj.code();

	}
}
