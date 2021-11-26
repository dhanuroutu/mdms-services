package com.mdms.employee.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdms.employee.app.entity.EmployeeType;
import com.mdms.employee.app.exception.ResourceNotFoundException;
import com.mdms.employee.app.repository.EmployeeTypeRepository;

@Service
public class EmployeeTypeServiceImpl implements EmployeeTypeService {
	
	@Autowired
	private EmployeeTypeRepository employeeTypeRepository;

	@Override
	public EmployeeType getEmployeeTypeById(Integer employeeTypeId) throws ResourceNotFoundException {
		return employeeTypeRepository.findById(employeeTypeId)
		.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeTypeId));
	}

	@Override
	public List<EmployeeType> getAllEmployeeTypes() {

		return employeeTypeRepository.findAll();
	}

	@Override
	public EmployeeType addEmployeeType(EmployeeType employeeType) {
		return employeeTypeRepository.save(employeeType);
	}
	
	@Override
	public EmployeeType updateEmployeeType(Integer employeeTypeId, EmployeeType employeeTypeDetails) throws ResourceNotFoundException {
		EmployeeType employeeType = employeeTypeRepository.findById(employeeTypeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeTypeId));

		employeeType.setEmpType(employeeTypeDetails.getEmpType());
		employeeType.setTypeDesc(employeeTypeDetails.getTypeDesc());
		
		return employeeTypeRepository.save(employeeType);
	}

	@Override
	public void deleteEmployeeType(Integer employeeTypeId) throws ResourceNotFoundException {
		EmployeeType employeeType = employeeTypeRepository.findById(employeeTypeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeTypeId));

		employeeTypeRepository.delete(employeeType);		
	}

}
