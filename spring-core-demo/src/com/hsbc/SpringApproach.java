package com.hsbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApproach {

	public static void main(String[] args) {
		// spring takes care of object creation & supplying the objects
		// we have bean factory or application context for it
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("beans.xml");
		// specify the bean factory to get the object having id 'x' from the spring container
		Identifier identifier = (Identifier)beanfactory.getBean("x");
		identifier = (Identifier)beanfactory.getBean("x");
		identifier.display();
	}

}
