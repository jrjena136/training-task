package com.json.json_java.com.json.json_java;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class example {

	public static void main(String[] args) {
		String jsontostr = "{\"id\":\"1\",\"rules\":[{\"field_name\":\"age\",\"field_type\":\"numeric\",\"condition\":{\"type\":\"validation\",\"operator\":\"gt\",\"value\":\"21\"}},{\"field_name\":\"rank\",\"field_type\":\"numeric\",\"condition\":{\"type\":\"validation\",\"operator\":\"eq\",\"value\":\"3\"}}]}";
		
		ObjectMapper objectmapper = new ObjectMapper();
		try {

			Criteria criteria = objectmapper.readValue(jsontostr, Criteria.class);
			System.out.println(criteria.toString());


		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
