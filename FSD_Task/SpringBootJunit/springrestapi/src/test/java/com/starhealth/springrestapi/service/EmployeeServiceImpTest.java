package com.starhealth.springrestapi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.starhealth.springrestapi.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmployeeServiceImpTest {

	@Autowired
	IEmployeeService ser;

	@Autowired
	RestTemplate restTemplate;

	@Test
	void testAddEmployee() {

		Employee emp = new Employee();

		emp.setEid(8);
		emp.setEname("vishal");
		emp.setSalary(32000);

		ser.addEmployee(emp);

		assertEquals("vishal", emp.getEname());
		assertTrue(emp.getEid() > 0);

	}

	@Test
	void testUpdateEmployee() {

		Employee emp = new Employee();

		emp.setEid(10);
		emp.setEname("harry");
		emp.setSalary(8000);

		ser.updateEmployee(emp);

		assertEquals(8000, emp.getSalary());

	}

	@Test
	void testSelectEmployeeById() {

		Employee emp2 = ser.selectEmployeeById(8);

		assertNotNull(emp2);

	}

	@Test
	void testDeleteEmployeeById() {

		Employee emp = new Employee();

		ser.deleteEmployeeById(10);

		assertEquals(null, emp.getEname());

	}

	@Test
	void testSelectAllEmployees() {

		List list;

		list = ser.selectAllEmployees();

		assertNotNull(list);

	}

	@Test
	void testSelectByEName() {

		Employee emp = ser.selectByEName("vishal");

		assertNotNull(emp);

	}

	@Test
	void testSelectBySalaryGT() {

		List<Employee> lis = ser.selectBySalaryGT(8000);

		assertEquals(4, lis.size());

	}

	@Test
	void testSelectSortedSalary() {

		Employee emp = new Employee();

		List<Employee> lis = ser.selectSortedSalary(emp.getSalary());

		assertNotNull(lis);


	}

}
