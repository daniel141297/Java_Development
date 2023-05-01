


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.google.gson.Gson;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


@Controller
public class Home_Controller {

	 @RequestMapping("/home")
	   public String home() {
	      return "home";   
	   }
	 @RequestMapping(value = "/import_excel", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	    public String importExcelFile(@RequestParam("excel_file") MultipartFile file,@RequestParam("tempid") String tempid,@RequestParam("param") Integer param) throws IOException , ServletException, ClassNotFoundException{
		
		 HttpStatus status = HttpStatus.OK;
	        List<Excel_data> productList = new ArrayList<>();
	       
	        XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
	       
	        XSSFSheet worksheet = workbook.getSheetAt(0);
	       
	        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
	            if (index > 0) {
	            	Excel_data product = new Excel_data();

	                XSSFRow row = worksheet.getRow(index);
	               int j=0;
	               int k=0;
	                for(int i=0;i<param;i++) {
	                	if(row.getCell(i)!=null ) {
	                		 j++;
	                	}
	                		
	                	
	                  // if(row.getCell(i)!=null || row.getCell(i)!='') {
	                	//  System.out.println(); 
	                  // }
	                	//int type = r.getCellType();
	                	//if (type == HSSFCell.CELL_TYPE_NUMERIC)
	                	 // System.out.println(cell.getNumericCellValue());
	                }
	               if(j==param) {
	            	   //insert query
	            	@Modifying
               		@Query(
               		  value ="insert into Users (name, age, email, status) values (:name, :age, :email, :status)",nativeQuery = true)
               		void insertUser(@Param("name") String name, @Param("age") Integer age, 
               		  @Param("status") Integer status, @Param("email") String email);
               	
	               }else {
	            	   //not inserted...
	            	   k++;
	               }
	               // product.setMobile_no(row.getCell(1).getRowIndex());
	              /*  product.setParameter1(row.getCell(1).getStringCellValue());
	                product.setParameter2(row.getCell(2).getStringCellValue());
	                product.setParameter3(row.getCell(3).getStringCellValue());
	                product.setParameter4(row.getCell(3).getStringCellValue());
	                product.setParameter5(row.getCell(3).getStringCellValue());
	                product.setParameter6(row.getCell(3).getStringCellValue());
	                product.setParameter7(row.getCell(3).getStringCellValue());
	                product.setParameter8(row.getCell(3).getStringCellValue());

	                productList.add(product);*/
	   
	        }
	            
	        }
	        Gson json = new Gson();
            String countryList = json.toJson("sjkdkjdk");
           
	        return countryList;
	    }
}
