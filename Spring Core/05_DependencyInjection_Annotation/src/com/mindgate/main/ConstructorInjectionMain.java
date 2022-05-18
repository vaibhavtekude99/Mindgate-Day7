package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Employee;

public class ConstructorInjectionMain {

	public static void main(String[] args) {

		
		
		System.out.println("main Start");
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee employee=applicationContext.getBean("employee",Employee.class);
		System.out.println(employee);
		
		
		System.out.println("main End");
	}

}
