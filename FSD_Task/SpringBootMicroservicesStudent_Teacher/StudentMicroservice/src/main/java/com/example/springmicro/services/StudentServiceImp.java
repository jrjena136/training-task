package com.example.springmicro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.springmicro.entity.Student;
import com.example.springmicro.repository.StudentRepo;
import com.example.springmicro.vo.StudentTeacherVo;
import com.example.springmicro.vo.Teacher;


@Service
public class StudentServiceImp implements IStudentService{

	@Autowired
	RestTemplate restTemplate;

	
	@Autowired
	StudentRepo repo;
	
	@Override
	public Student addStudent(Student stud) {
		// TODO Auto-generated method stub
		return repo.save(stud);
	}

	@Override
	public Student getStudentById(Long studId) {
		// TODO Auto-generated method stub
		return repo.findById(studId).orElse(new Student());
	}

	@Override
	public StudentTeacherVo getStudentAndTeacher(Long studId) {
		// TODO Auto-generated method stub
		Student student = getStudentById(studId);
		
		Long teacherId =  student.getTeacherId();
		
		Teacher teacher  =	restTemplate.getForObject("http://localhost:8282/api/teacher/get/"+teacherId, Teacher.class);	
		
		//Department department = (Department)	response.getBody();
	
		StudentTeacherVo  studTeacher = new StudentTeacherVo(student, teacher);
		
		return studTeacher;
	}

}
