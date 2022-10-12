package com.starhealth.springrestapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

@Entity
@Table(name="EmployeeDetails")
public class Employee {            	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;  // now eid will be consider as primary key in DB
	@Column(name="emp_name")
	private String ename;
	private double salary;
	
	

}
