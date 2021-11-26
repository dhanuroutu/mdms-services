package com.mdms.employee.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdms.employee.app.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> getEmployeesByEmployeeTypeAndIsActive(Integer employeeType, boolean isActive);

}
