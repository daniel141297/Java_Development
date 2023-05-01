package com.excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Controller
public class Home_Controller {

	@Autowired
	JdbcTemplate jdbc;
	
	private int limit=5001;

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	/*@ResponseBody
	@RequestMapping(value = "/import_excel", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject importExcelFile(@RequestParam("excel_file") MultipartFile file,
			@RequestParam("tempid") String tempid, @RequestParam("param") Integer param)
			throws IOException, ServletException, ClassNotFoundException {
       excelvalidate(file.getInputStream(),param,tempid);
		JSONObject data = new JSONObject();
		int empty_count = 0;
		int mobile_count = 0;
					if (mobile.length() == 10) {
						// mobile=mobile.substring(mobile.length()-12, mobile.length());
							// insert query
						} else {
							// not inserted...
							empty_count++;
						}
					} else {
						mobile_count++;
					}
				}
			}
		}

		data.put("empty_count", empty_count);
		data.put("mobile_count", mobile_count);
		data.put("status", true);

		return data;
	}*/
	@RequestMapping(value = "/query",method = RequestMethod.GET)
	public void queryexecute() {
	        int	param=10;
		 String insertColumns = ""; 
		 String insertValues = "";
		 
		    for(int i = 1; i <= param;i++){
		      insertColumns += ", " + "parameter"+i ;
		      insertValues += "?,";
		    }

		 String insertSql = "INSERT INTO excel_data (mobile_no,template_id" + insertColumns + ",inserted_date) values(?,?," + insertValues + "?)"; 
         System.out.println(insertSql);
	}
	/*private void mobilevalidate(row) {
		String mobile = String.valueOf(row.getCell(0));
		// String mobile=row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
		System.out.println(mobile);
		mobile = mobile.replace("+", "").replace(" ", "").trim().replace("-", "").trim().replace(".", "")
				.trim();
		
		mobile = mobile.substring(0, mobile.length() - 2);
		
	}*/
	private String excelvalidate(InputStream inputStream,int param,String tempid) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet worksheet = workbook.getSheetAt(0);
		for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
			int j = 0;
			if (worksheet.getPhysicalNumberOfRows() <= limit) {
				if (index > 0) {
					XSSFRow row = worksheet.getRow(index);
					     //mobilevalidate(row);
					for (int i = 0; i <= param; i++) {						
						if (row.getCell(i) != null) {
							ArrayList<String> answer = new ArrayList<String>();
							for (row.getCell(i)  c : row.getCell(i)) {
							 answer.add(c.mobile);
							} 
							j++;
						}
					}
					if (j == param) {
						queryexecute(param,tempid,row);
					}else {
						return "false";
					}
	}

	
}
