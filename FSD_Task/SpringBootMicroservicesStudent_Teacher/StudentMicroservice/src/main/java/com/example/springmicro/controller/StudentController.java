package com.example.springmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmicro.entity.Student;
import com.example.springmicro.services.IStudentService;
import com.example.springmicro.vo.StudentTeacherVo;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	IStudentService service;
	
	@PostMapping("/add")
	public Student addNewStudent(@RequestBody Student stud) {
		return service.addStudent(stud);
	}
	
	@GetMapping("/get/{studId}")
	public Student getStudentById(@PathVariable Long studId) {
		return service.getStudentById(studId);
	}

	@GetMapping("/get/stud-teacher/{studId}")
	public StudentTeacherVo getStudentAndTeacher(@PathVariable Long studId) {
	
		return service.getStudentAndTeacher(studId);
	}
}
