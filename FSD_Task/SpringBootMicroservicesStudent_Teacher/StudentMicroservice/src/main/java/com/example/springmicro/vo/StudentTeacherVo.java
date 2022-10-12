package com.example.springmicro.vo;

import com.example.springmicro.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentTeacherVo {

	private Student student;
	private Teacher teacher;
}
