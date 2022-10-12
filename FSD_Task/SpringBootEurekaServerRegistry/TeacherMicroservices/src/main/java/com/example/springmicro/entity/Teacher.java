package com.example.springmicro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Teacher {// entity class

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  teacherId;
	private String teacherName;
	private String teachersubject;
	private String teaherdesignation;
	
}
