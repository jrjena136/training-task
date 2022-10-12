package com.example.springmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmicro.entity.Teacher;
import com.example.springmicro.service.ITeacherService;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

	@Autowired
	ITeacherService service;
	
	@PostMapping("/add")
	public Teacher addTeacher(@RequestBody Teacher teacher) {

		return service.addTeacher(teacher);

	}

	@GetMapping("/get/{tid}")
	public Teacher getTeacherById(@PathVariable  Long tid) {

		
			return service.getTeacherById(tid);
		
	}
}
