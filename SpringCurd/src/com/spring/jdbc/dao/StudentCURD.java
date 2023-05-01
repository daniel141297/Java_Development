package com.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.data.Student;

public class StudentCURD implements StudentDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name,int age) {
		 String Sql="insert into student(name,age) values(?,?)";
		 jdbcTemplateObject.update(Sql,name,age);
		 System.out.println("Record inserted sucessfully ");
		
	}

	@Override
	public Student getStudent(int id) {
		String Sql="select * from student where id=?";
		Student student=(Student) jdbcTemplateObject.queryForObject(Sql, new Object[] {id},new StudentMapper());
		
		
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String Sql="select * from student";
		List<Student> students=	jdbcTemplateObject.query(Sql, new StudentMapper());
		
		return students;
	}

	@Override
	public void delete(int id) {
		String Sql="delete from student where id=?";
		jdbcTemplateObject.update(Sql,id);
		System.out.println("deleted sucessfully");
		
		
	}

	@Override
	public void update(int id,int age) {
	  String Sql="update student set age=? where id=?";
	  jdbcTemplateObject.update(Sql,age,id);
	  System.out.println("Record Updated Sucessfully");
	}

}
