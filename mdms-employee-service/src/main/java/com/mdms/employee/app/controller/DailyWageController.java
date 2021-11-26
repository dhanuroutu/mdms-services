package com.mdms.employee.app.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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

import com.mdms.employee.app.entity.DailyWage;
import com.mdms.employee.app.exception.ResourceNotFoundException;
import com.mdms.employee.app.service.DailyWageService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class DailyWageController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DailyWageController.class);


	@Autowired
	private DailyWageService dailyWageService;

	@GetMapping("/dailyWages/date/{date}")
	public List<DailyWage> getAllDailyWagesByDate(@PathVariable(value = "date") @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		//convert date string to util date
		System.out.println("date :::"+date);
		return dailyWageService.getAllDailyWagesByDate(date);
	}

	@GetMapping("/dailyWages/{id}")
	public ResponseEntity<DailyWage> getDailyWageById(@PathVariable(value = "id") Integer dailyWageId)
			throws ResourceNotFoundException {
		DailyWage dailyWage = dailyWageService.getDailyWageById(dailyWageId);

		return ResponseEntity.ok().body(dailyWage);
	}

	@PostMapping("/dailyWages")
	public DailyWage createDailyWage(@Validated @RequestBody DailyWage dailyWage) {
		return dailyWageService.addDailyWage(dailyWage);
	}

	@PutMapping("/dailyWages/{id}")
	public ResponseEntity<DailyWage> updateDailyWage(@PathVariable(value = "id") Integer DailyWageId,
			@Validated @RequestBody DailyWage dailyWagedetails) throws ResourceNotFoundException {
		final DailyWage updatedDailyWage = dailyWageService.updateDailyWage(DailyWageId, dailyWagedetails);
		return ResponseEntity.ok(updatedDailyWage);
	}

	@DeleteMapping("/dailyWages/{id}")
	public Map<String, Boolean> deleteEmployeeType(@PathVariable(value = "id") Integer DailyWageId)
			throws ResourceNotFoundException {
		dailyWageService.deleteDailyWage(DailyWageId);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Dialy Wage deleted successfully", Boolean.TRUE);
		return response;
	}
	
}
