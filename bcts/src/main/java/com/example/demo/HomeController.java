package com.example.demo;

import com.example.data.*;
import com.example.model.*;

import com.google.gson.Gson;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	HomeModel model;
	
	 @RequestMapping(value="/home")
	    public String details() {
		
		List<Homedata> data= jdbcTemplate.query("select * from student2", new getdata());

//		String s = "[{"Service_Name":"service 1                                                                                                                                             ","count_four":0,"count":0,"count_eight":1},{"Service_Name":"service 2                                                                                                                                             ","count_four":0,"count":10,"count_eight":11},{"Service_Name":"service 3                                                                                                                                             ","count_four":0,"count":70,"count_eight":0},{"Service_Name":"service 4                                                                                                                                             ","count_four":0,"count":80,"count_eight":10},{"Service_Name":"service 5                                                                                                                                             ","count_four":0,"count":90,"count_eight":10},{"Service_Name":"service 6                                                                                                                                             ","count_four":0,"count":0,"count_eight":10},{"Service_Name":"service 7                                                                                                                                             ","count_four":0,"count":50,"count_eight":30}]";
		 Gson json=new Gson();
		 String details =json.toJson(data);
		   
	        return details;
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
