package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class LoggingAspect {
	
	public void loggingadvice() {
		System.out.println("logging from the advices");
	}
	/*
	 * @Before("allGetter()") public void loggingAdvice() {
	 * System.out.println("Advice run,get method is called");
	 * 
	 * }
	 */
	
	/*
	 * @Before("allGetter()") public void SecondAdvice() {
	 * System.out.println(" Second Advice run,get method is called");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Pointcut("within(com.spring.model.Triangle)") public void allGetter() {
	 * ///pointcut method
	 * 
	 * }
	 */
	/*
	 * @After("allCircleMethod()") public void loggingAdvice(JoinPoint joinpoint) {
	 * System.out.println("Advice run,get method is called");
	 * System.out.println(joinpoint.getTarget()); }
	 */

	/*
	 * @Before("args(name)") public void StringArugumentMethod(String name) {
	 * ///pointcut method
	 * System.out.println(" A method that takes String arguments has been called"
	 * +name);
	 * 
	 * }
	 */
	/*
	 * @Pointcut("within(com.spring.model.Triangle)") public void allCircleMethod()
	 * {
	 * 
	 * }
	 * 
	 * 
	 * @Pointcut("execution(* get*())") public void allegt() { }
	 * 
	 * @After("args(name)") public void Stringprint(String name) {
	 * System.out.println("after method called"); }
	 * 
	 * @AfterThrowing("args(name)") public void StringprintThrowAdvice(String name)
	 * { System.out.println("exception is called"); }
	 * 
	 * @AfterReturning(pointcut="args(name)",returning="returnString") public void
	 * StringArgumentsMethods(String name,String returnString) { System.out.
	 * println("A method that takes String Arguments has been called,the values is:"
	 * +name+"the output is:"+returnString); }
	 * 
	 * @Around("allegt()") public void myaroundMethod(ProceedingJoinPoint
	 * proceddingJoinPoint) {
	 * 
	 * try { System.out.println("before target method");
	 * proceddingJoinPoint.proceed(); System.out.println("after target method"); }
	 * catch (Throwable e) { System.out.println("error"); //e.printStackTrace(); }
	 * 
	 * }
	 */
	}



