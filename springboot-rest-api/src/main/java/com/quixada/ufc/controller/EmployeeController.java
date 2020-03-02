package com.quixada.ufc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quixada.ufc.model.Employee;
import com.quixada.ufc.service.EmployeeService;

@RequestMapping("employee")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee) {
	
		return employeeService.saveEmployee(employee);
	}
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee) {
		
		return employeeService.updateEmployee(employee);
	}

	@GetMapping("/all")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployeeList();
	}
	@GetMapping("/{employeeID}")
	public Optional<Employee> getEmployee(@PathVariable(name="employeeID") long employeeID) {
		return employeeService.getEmployee(employeeID);
	}
	
	@DeleteMapping("/delete/{employeeID}")
	public void deleteEmployee(@PathVariable(name="employeeID" )long employeeID) {
		employeeService.deleteEmployee(employeeID);
	}
}
