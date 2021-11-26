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
import org.springframework.web.bind.annotation.RestController;

import com.mdms.employee.app.entity.EmployeeType;
import com.mdms.employee.app.exception.ResourceNotFoundException;
import com.mdms.employee.app.service.EmployeeTypeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class EmployeeTypeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeTypeController.class);


	@Autowired
	private EmployeeTypeService employeeTypeService;

	@GetMapping("/employeeTypes")
	public List<EmployeeType> getAllEmployees() {
		return employeeTypeService.getAllEmployeeTypes();
	}

	@GetMapping("/employeeTypes/{id}")
	public ResponseEntity<EmployeeType> getEmployeeById(@PathVariable(value = "id") Integer employeeTypeId)
			throws ResourceNotFoundException {
		EmployeeType employeeType = employeeTypeService.getEmployeeTypeById(employeeTypeId);

		return ResponseEntity.ok().body(employeeType);
	}

	@PostMapping("/employeeTypes")
	public EmployeeType createEmployee(@Validated @RequestBody EmployeeType employeeType) {
		return employeeTypeService.addEmployeeType(employeeType);
	}

	@PutMapping("/employeeTypes/{id}")
	public ResponseEntity<EmployeeType> updateEmployee(@PathVariable(value = "id") Integer employeeTypeId,
			@Validated @RequestBody EmployeeType employeeTypeDetails) throws ResourceNotFoundException {
		final EmployeeType updatedEmployeeType = employeeTypeService.updateEmployeeType(employeeTypeId, employeeTypeDetails);
		return ResponseEntity.ok(updatedEmployeeType);
	}

	@DeleteMapping("/employeeTypes/{id}")
	public Map<String, Boolean> deleteEmployeeType(@PathVariable(value = "id") Integer employeeTypeId)
			throws ResourceNotFoundException {
		employeeTypeService.deleteEmployeeType(employeeTypeId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Employee deleted successfully", Boolean.TRUE);
		return response;
	}
	
}
