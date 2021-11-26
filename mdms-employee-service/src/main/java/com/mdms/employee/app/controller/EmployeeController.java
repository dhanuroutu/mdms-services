package com.mdms.employee.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mdms.employee.app.entity.Employee;
import com.mdms.employee.app.exception.ResourceNotFoundException;
import com.mdms.employee.app.service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		LOGGER.info("get all employees called::::");
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Integer employeeId)
			throws ResourceNotFoundException {
		
		LOGGER.info("getEmployeeById called::::");

		Employee employee = employeeService.getEmployeeById(employeeId);

		return ResponseEntity.ok().body(employee);
	}
	
	@GetMapping("/employees/type/{employeeType}")
	public ResponseEntity<List<Employee>> getEmployeesByType(@PathVariable(value = "employeeType") Integer employeeType)
			throws ResourceNotFoundException {
		
		LOGGER.info("getEmployeesByType called::::");

		List<Employee> employees = employeeService.getEmployeesByType(employeeType);

		return ResponseEntity.ok().body(employees);
	}

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		LOGGER.info("createEmployee called::::", employee);
		return employeeService.addEmployee(employee);
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Integer employeeId,
			@Validated @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
		
		LOGGER.info("updateEmployee called::::");
		final Employee updatedEmployee = employeeService.updateEmployee(employeeId, employeeDetails);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/employees/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Integer employeeId, @RequestParam("active") String isActive)
			throws ResourceNotFoundException {
		
		LOGGER.info("deleteEmployee called::::");
		employeeService.deleteEmployee(employeeId,isActive);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Employee deleted successfully", Boolean.TRUE);
		return response;
	}
	
}
