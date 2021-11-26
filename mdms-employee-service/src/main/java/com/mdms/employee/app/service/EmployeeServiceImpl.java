package com.mdms.employee.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdms.employee.app.controller.EmployeeController;
import com.mdms.employee.app.entity.Employee;
import com.mdms.employee.app.exception.ResourceNotFoundException;
import com.mdms.employee.app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployeeById(Integer employeeId) throws ResourceNotFoundException {
		return employeeRepository.findById(employeeId)
		.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
	}

	@Override
	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		LOGGER.info("employee::::",employee);
		employee.setIsActive(true);
		return employeeRepository.save(employee);
	}
	
	@Override
	public Employee updateEmployee(Integer employeeId, Employee employeeDetails) throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

		employee = getEmployeeFromEmployeeDetails(employee,employeeDetails);
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Integer employeeId, String isActive) throws ResourceNotFoundException {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        employee.setIsActive(Boolean.valueOf(isActive));
		employeeRepository.save(employee);		
	}
	
	public Employee getEmployeeFromEmployeeDetails(Employee employee,Employee employeeDetails) {
		employee.setName(employeeDetails.getName());
		employee.setContactNumber(employeeDetails.getContactNumber());
		employee.setGender(employeeDetails.getGender());
		employee.setAddress(employeeDetails.getAddress());
		employee.setEmployeeType(employeeDetails.getEmployeeType());
		employee.setGovtId(employeeDetails.getGovtId());
		employee.setGovtIdProofType(employeeDetails.getGovtIdProofType());
		
		return employee;
	}

	@Override
	public List<Employee> getEmployeesByType(Integer employeeType) {
		return employeeRepository.getEmployeesByEmployeeTypeAndIsActive(employeeType,true);
	}

}
