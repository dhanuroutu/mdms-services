package com.mdms.employee.app.service;

import java.util.Date;
import java.util.List;

import com.mdms.employee.app.entity.DailyWage;
import com.mdms.employee.app.exception.ResourceNotFoundException;

public interface DailyWageService {

	List<DailyWage> getAllDailyWagesByDate(Date date);

	DailyWage getDailyWageById(Integer dailyWageId) throws ResourceNotFoundException;

	DailyWage addDailyWage(DailyWage dailyWage);

	DailyWage updateDailyWage(Integer dailyWageId, DailyWage dailyWagedetails) throws ResourceNotFoundException;

	void deleteDailyWage(Integer dailyWageId) throws ResourceNotFoundException;

}
