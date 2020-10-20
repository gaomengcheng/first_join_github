package com.atguigu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;

public class MainTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
		
		String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
		for (String i : beanNamesForType) {
			System.out.println(i);
		}
	}
}
