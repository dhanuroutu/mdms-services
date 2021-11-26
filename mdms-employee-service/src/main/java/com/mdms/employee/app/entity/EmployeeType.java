package com.mdms.employee.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class EmployeeType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empTypeId;
	
	@Column
	private String empType;
	
	@Column
	private String typeDesc;
}
