package com.spring.jdbc.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentCURD;
import com.spring.jdbc.data.Student;

public class JdbcMain {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
         StudentCURD studentcurd=(StudentCURD) context.getBean("studentCURD");
         
         studentcurd.create("Raju", 26);
         
         List<Student> students=studentcurd.listStudents();
         
         for (Student record:students) {
        	 System.out.println("ID:"+record.getId());
        	 System.out.println("Name:"+record.getName());
        	 System.out.println("Age:"+record.getAge());
        	 
         }
         
         studentcurd.update(2, 34);
         
         Student student =studentcurd.getStudent(5);
         System.out.println("ID:"+student.getId());
    	 System.out.println("Name:"+student.getName());
    	 System.out.println("Age:"+student.getAge());
    	 
    	 studentcurd.delete(3);
    	 
	}

}
