package com.quixada.ufc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quixada.ufc.model.Employee;
import com.quixada.ufc.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.saveAndFlush(employee);
	}

	@Override
	public List<Employee> getAllEmployeeList() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(Long employeeID) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeID);
	}

	@Override
	public void deleteEmployee(Long employeeID) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeID);
	}

}
