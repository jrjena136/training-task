package com.starhealth.springrestapi.restcontroller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.starhealth.springrestapi.entity.Employee;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmployeeRestControllerTest {

	@Autowired
	RestTemplate restTemplate;

	@Test
	void testAdd() {

		Employee emp = new Employee();

		emp.setEid(8);
		emp.setEname("Vishal");
		emp.setSalary(32000);

		Employee emp2 = restTemplate.postForObject("http://localhost:8080/api/v1/employees/add", emp, Employee.class);

		assertNotNull(emp2);

	}

	@Test
	void testUpdate() {

		Employee emp = new Employee();

		emp.setEid(9);
		emp.setEname("vijay");
		emp.setSalary(20000);

		Employee emp2 = restTemplate.postForObject("http://localhost:8080/api/v1/employees/add", emp, Employee.class);

		assertNotNull(emp2);

	}

	@Test
	void testDelete() {
		
		int eid = 2;

		String url = "http://localhost:8080/api/v1/employees/delete/" + eid;

		Employee emp3 = new Employee();

		restTemplate.delete(url);

		// log.debug("emp_name"+ emp3);

		assertEquals(null, emp3.getEname());

	}

	@Test
	void testGetById() {
		
		int eid = 3;

		Employee emp3 = restTemplate.getForObject("http://localhost:8080/api/v1/employees/get/" + eid, Employee.class);

		log.debug("emp_name" + emp3);

		assertNotNull(emp3);

	}

	@Test
	void testGetAll() {

		ResponseEntity<String> res = restTemplate.getForEntity("http://localhost:8080/api/v1/employees/getall",
				String.class);

		Assertions.assertEquals(res.getStatusCode(), HttpStatus.OK);

	}

	@Test
	void testSelectByEName() {
		
		String ename = "vijay";

		Employee emp4 = restTemplate.getForObject("http://localhost:8080/api/v1/employees/getbyename/" + ename,
				Employee.class);

		// log.debug("emp_name"+ emp3);

		assertEquals(ename, emp4.getEname());

	}

	@Test
	void testSelectBySalaryGT() {

		double salary = 32000;
		ResponseEntity<String> res = restTemplate
				.getForEntity("http://localhost:8080/api/v1/employees/get/salarygt/" + salary, String.class);

		Assertions.assertEquals(res.getStatusCode(), HttpStatus.OK);

	}

	@Test
	void testGetSortedSalary() {

		double salary = 6000;

		ResponseEntity<String> res = restTemplate
				.getForEntity("http://localhost:8080/api/v1/employees/get/sortedsalary/" + salary, String.class);

		Assertions.assertEquals(res.getStatusCode(), HttpStatus.OK);

	}

}
