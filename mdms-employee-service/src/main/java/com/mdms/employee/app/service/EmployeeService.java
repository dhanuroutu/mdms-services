package com.mdms.employee.app.service;

import java.util.List;

import com.mdms.employee.app.entity.Employee;
import com.mdms.employee.app.exception.ResourceNotFoundException;

public interface EmployeeService {

	Employee getEmployeeById(Integer employeeId) throws ResourceNotFoundException;

	List<Employee> getAllEmployees();

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Integer employeeId, Employee employeeDetails) throws ResourceNotFoundException;

	void deleteEmployee(Integer employeeId, String isActive) throws ResourceNotFoundException;

	List<Employee> getEmployeesByType(Integer employeeType);

}
