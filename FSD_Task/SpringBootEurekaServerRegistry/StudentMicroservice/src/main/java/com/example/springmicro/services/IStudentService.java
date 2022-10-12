package com.example.springmicro.services;

import com.example.springmicro.entity.Student;
import com.example.springmicro.vo.StudentTeacherVo;

public interface IStudentService {
	
	public Student addStudent(Student stud);
	
	public Student getStudentById(Long studId);
	
	public StudentTeacherVo getStudentAndTeacher(Long studId);

}
