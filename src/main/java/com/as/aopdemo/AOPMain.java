package com.as.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.as.aopdemo.service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService= context.getBean("shapeService",ShapeService.class);
		//System.out.println(shapeService.getCircle().getName());//no need to cast
		//System.out.println(shapeService.getTriangle().getName());//no need to cast
		shapeService.getCircle().setName("any name");//no need to cast


	}

}
