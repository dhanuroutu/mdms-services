package com.mdms.employee.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.boot.context.properties.bind.DefaultValue;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private String contactNumber;
	@Column
	private String govtIdProofType;
	@Column
	private String govtId;
	@Column
	private String address;
	@Column
	private String gender;
	@Column
	private Integer age;
	@Column
	private Integer employeeType;
	@Column
	@ColumnDefault(value = "1")
	private Boolean isActive;
	
	
}
