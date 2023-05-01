package com.spring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint; 

@Aspect
public class Logging {

   /** Following is the definition for a PointCut to select
    *  all the methods available. So advice will be called
    *  for all the methods.
    */
   @Pointcut("execution(* com.tutorialspoint.Student.getAge(..))")
   private void selectGetAge(){}

   /** 
    * This is the method which I would like to execute
    * around a selected method execution.
    */
   @Around("selectGetAge()")
   public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
      System.out.println("Around advice");
      Object[] args = proceedingJoinPoint.getArgs();
      if(args.length>0){
         System.out.print("Arguments passed: " );
         for (int i = 0; i < args.length; i++) {
            System.out.print("arg "+(i+1)+": "+args[i]);
         }
      }

      Object result = proceedingJoinPoint.proceed(args);
      System.out.println("Returning " + result);
   }  
}