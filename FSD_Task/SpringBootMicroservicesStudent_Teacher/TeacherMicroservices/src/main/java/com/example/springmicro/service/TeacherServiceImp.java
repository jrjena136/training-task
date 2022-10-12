package com.example.springmicro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmicro.entity.Teacher;
import com.example.springmicro.repository.TeacherRepository;

@Service
public class TeacherServiceImp implements ITeacherService{

	@Autowired
	TeacherRepository repo;

	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return repo.save(teacher);
	}

	@Override
	public Teacher getTeacherById(Long tid) {
		// TODO Auto-generated method stub
		return repo.findById(tid).orElse(new Teacher());
	}
}
