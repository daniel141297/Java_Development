package com.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;  
@Aspect
public class Logging {

   /** 
    * This is the method which I would like to execute
    * after a selected method execution.
    */
   @AfterReturning(pointcut = "execution(* com.spring.Student.*(..))", 
      returning = "retVal")
   public void afterReturningAdvice(JoinPoint jp, Object retVal){
      System.out.println("Method Signature: "  + jp.getSignature());  
      System.out.println("Returning:" + retVal.toString() );
   }
}