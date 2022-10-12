package com.example.springmicro.service;

import com.example.springmicro.entity.Teacher;

public interface ITeacherService {

	public Teacher addTeacher(Teacher teacher);
	
	public Teacher getTeacherById(Long tid);
	
}
