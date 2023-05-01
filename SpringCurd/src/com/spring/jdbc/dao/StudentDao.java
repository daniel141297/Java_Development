package com.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import com.spring.jdbc.data.Student;

public interface StudentDao {
	
	public void setDataSource(DataSource dataSource);
	public void create(String name,int age);
	public Student getStudent(int id);
	public List<Student> listStudents();
	public void delete(int id);
	public void update(int id,int age);
	

	

}
