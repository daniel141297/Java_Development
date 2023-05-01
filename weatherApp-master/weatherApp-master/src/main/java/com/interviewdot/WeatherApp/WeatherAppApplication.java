package com.interviewdot.WeatherApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

@SpringBootApplication
@Controller
public class WeatherAppApplication {

	 @GetMapping(value = "/dan")
	    public String index() {
	    	return "index.html";
	    }
	    
	//public static void main(String[] args) {
		//
		
		
		
		
public static Map<String,Object> jsonToMap(String str){
	 Map<String,Object> map = new Gson().fromJson(str,new TypeToken<HashMap<String,Object>> () {}.getType());
		    return map;
		}

		   public static void  main(String[] args) {

		      String API_KEY = "60c0662f799acce12a4277e3595f4891";
		      String LOCATION = "Chennai";
 String urlString = "http://api.openweathermap.org/data/2.5/forecast?q=" + LOCATION + "&appid=" + API_KEY + "&units =imperial";



		      try{

		          StringBuilder result = new StringBuilder();
		          URL url = new URL(urlString);
		          URLConnection conn = url.openConnection();
		          BufferedReader rd = new BufferedReader(new InputStreamReader (conn.getInputStream()));
		          String line;
		          while ((line = rd.readLine()) != null){
		              result.append(line);
		          }

		          rd.close();
		          System.out.print(result);

		     /*     Map<String, Object > respMap = jsonToMap (result.toString());
		          Map<String, Object > mainMap = jsonToMap (respMap.get("main").toString());
		          Map<String, Object > windMap = jsonToMap (respMap.get("wind").toString());

		          System.out.println("Current Temperature: " + result.temp  );
		          System.out.println("Current Humidity: " + result.get("humidity")  );
		          System.out.println("Wind Speed: " + result.get("speed")  );
		          System.out.println("Wind Angle: " + result.get("deg")  );

*/
		      }catch (IOException e){
		          System.out.println(e.getMessage());
		      }


		      SpringApplication.run(WeatherAppApplication.class, args);
		//}
	}

}
