package com.example.model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.example.data.*;

public class HomeModel {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Homedata> getdata(){
		return jdbcTemplate.query("select * from student", new getdata());
	}
	private static final class getdata implements RowMapper<Homedata>{
		public Homedata mapRow(ResultSet rs,int rowNum) throws SQLException{
			Homedata data=new Homedata();
			data.setStudent_name(rs.getString("name"));
			data.setRegno(rs.getInt("regno"));
			data.setMobileno(rs.getInt("mobileno"));
			return data;
			
		}
	}
}
