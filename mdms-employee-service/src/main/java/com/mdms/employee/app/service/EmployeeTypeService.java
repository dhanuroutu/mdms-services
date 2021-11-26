package com.mdms.employee.app.service;

import java.util.List;

import com.mdms.employee.app.entity.EmployeeType;
import com.mdms.employee.app.exception.ResourceNotFoundException;

public interface EmployeeTypeService {

	List<EmployeeType> getAllEmployeeTypes();

	EmployeeType getEmployeeTypeById(Integer employeeTypeId) throws ResourceNotFoundException;

	EmployeeType addEmployeeType(EmployeeType employeeType);

	EmployeeType updateEmployeeType(Integer employeeTypeId, EmployeeType employeeTypeDetails) throws ResourceNotFoundException;

	void deleteEmployeeType(Integer employeeTypeId) throws ResourceNotFoundException;

}
