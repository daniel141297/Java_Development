package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
         new ClassPathXmlApplicationContext("Beans.xml");

      Student student = (Student) context.getBean("student");

      //Create the Proxy Factory
      AspectJProxyFactory proxyFactory = new AspectJProxyFactory(student);

      //Add Aspect class to the factory
      proxyFactory.addAspect(Logging.class);

      //Get the proxy object
      Student proxyStudent = proxyFactory.getProxy();

      //Invoke the proxied method.
      proxyStudent.getAge();
 
   }
}