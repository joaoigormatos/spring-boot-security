package com.quixada.ufc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.quixada.ufc.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	List<Employee> getAllEmployeeList();
	
	Optional<Employee> getEmployee(Long employeeID);
	
	void deleteEmployee(Long employeeID);
}
