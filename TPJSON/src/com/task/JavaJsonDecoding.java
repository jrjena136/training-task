package com.task;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

public class JavaJsonDecoding {
	
	public static void main(String[] args)
    {
		JSONParser parser = new JSONParser();
	      try {
	         Object obj = parser.parse(new FileReader("C:\\Users\\niteshmanish.gehlot\\Desktop\\course.json"));
	         JSONObject jsonObject = (JSONObject)obj;
	         String id = (String)jsonObject.get("id");
	      //   String course = (String)jsonObject.get("value");
	         
	 
	         
	         
	         JSONArray rules = (JSONArray)jsonObject.get("rules");
	        
	         System.out.println("Id:-: " + id);
	      //  System.out.println("Course: " + course);
	         System.out.println("Rules:");
	         Iterator iterator = rules.iterator();
	         while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	         }
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	   }
}

