package com.example.springmicro.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Teacher { //pojo or vo class

	private Long  teacherId;
	private String teacherName;
	private String teachersubject;
	private String teaherdesignation;
	
}
