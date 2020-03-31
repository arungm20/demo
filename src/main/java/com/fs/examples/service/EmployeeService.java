package com.fs.examples.service;

import java.util.List;

import com.fs.examples.model.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);

	void insertEmployees(List<Employee> employees);

	List<Employee> getAllEmployees();

	void getEmployeeById(String empid);
}
