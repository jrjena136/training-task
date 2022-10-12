package com.example.springmicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springmicro.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
