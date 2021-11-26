package com.mdms.employee.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DailyWage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer wageId;
	
	@Column
	private Integer employeeId;
	
	@Column
	private Date date;
	
	@Column
	private Float numOfUnits;

}
