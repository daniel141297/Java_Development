package com.spring.transaction;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDao {
	
	public void setDataSource(DataSource ds);
	
	public void create(String name,int age,int mark,int year);
	
	public List<StudentMarks> listStudents();

}
