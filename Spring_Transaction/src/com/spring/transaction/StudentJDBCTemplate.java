package com.spring.transaction;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	private PlatformTransactionManager transactionManager;
	

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
		
	}
	
	public void setTransactionManager(PlatformTransactionManager PlatformTransactionManager) {
		this.transactionManager=PlatformTransactionManager;
	}

	@Override
	public void create(String name,int age,int marks,int year) {
		TransactionDefinition def=new DefaultTransactionDefinition();
		TransactionStatus status= transactionManager.getTransaction(def);
		try {
		String SQL1="insert into student (name,age) values(?,?)";
		jdbcTemplateObject.update(SQL1,name,age);
		String SQL2="select max(id) from student";
		int sid=jdbcTemplateObject.queryForObject(SQL2, int.class);
		String SQL3	="insert into marks (sid,marks,year) values(?,?,?)";
		jdbcTemplateObject.update(SQL3,sid,marks,year);
		
		transactionManager.commit(status);
		}catch(DataAccessException e){
			System.out.println("error happend");
			transactionManager.rollback(status);
			throw e;
			
			
		}
		return;
	}

	@Override
	public List<StudentMarks> listStudents() {
		String SQL="select * from student,marks where student.id=marks.sid";
		List<StudentMarks> studentMarks=jdbcTemplateObject.query(SQL, new StudentMarksMapper());
		return studentMarks;
	}

}
