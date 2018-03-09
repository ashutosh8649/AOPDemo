package com.as.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.as.aopdemo.modal.Circle;

@Aspect
public class LoggingAspect {
	
	//@Before("execution(public String getName())") getName of eveery class gets called
	//@Before("execution(public String com.as.apdemo.modal.Circle.getName())")//only circle class method method gets called
	//@Before("execution(public String get*())")//called before every getter method of spring type
	//@Before("execution(public * get*())")//called before every getter
	//@Before("execution(* get*())")
	//@Before("execution(* get*(*))") one or more arg
	//@Before("execution(public String com.as.apdemo.modal.*.get*())")//only circle class method method gets called

	//@Before("execution(* get*(..))")//zer or more
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
		Circle circle= (Circle)joinPoint.getTarget();
	}
	
	@Pointcut("within(com.as.aopdemo.modal.Circle)")
	public void allCircleMethods() {}
	
	/*@Before("args(String)")
	public void stringArgumentMethod() {
		System.out.println("A method that takes argument is called");
	}*/
	
}
