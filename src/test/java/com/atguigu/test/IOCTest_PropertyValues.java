package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfigOfPropertyValues;

public class IOCTest_PropertyValues {

	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
			MainConfigOfPropertyValues.class);

	@Test
	public void test01() {
		printBeans(applicationContext);
		
		System.out.println("=============");
		
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
		
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String property = environment.getProperty("person.nickName");
		System.out.println(property);
		applicationContext.close();
	}

	private void printBeans(ApplicationContext applicationContext) {
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : definitionNames) {
			System.out.println(name);
		}
	}
}
