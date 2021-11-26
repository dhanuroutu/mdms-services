package com.mdms.employee.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdms.employee.app.entity.DailyWage;
import com.mdms.employee.app.entity.EmployeeType;
import com.mdms.employee.app.exception.ResourceNotFoundException;
import com.mdms.employee.app.repository.DailyWageRepository;
import com.mdms.employee.app.repository.EmployeeTypeRepository;

@Service
public class DailyWageServiceImpl implements DailyWageService {
	
	@Autowired
	private DailyWageRepository dailyWageRepository;

	@Override
	public List<DailyWage> getAllDailyWagesByDate(Date date) {
		return dailyWageRepository.findAllByDate(date);
	}

	@Override
	public DailyWage getDailyWageById(Integer dailyWageId) throws ResourceNotFoundException {
		return dailyWageRepository.findById(dailyWageId)
		.orElseThrow(() -> new ResourceNotFoundException("Dialy Wage not found for this id :: " + dailyWageId));
	}

	@Override
	public DailyWage addDailyWage(DailyWage dailyWage) {
		return dailyWageRepository.save(dailyWage);
	}

	@Override
	public DailyWage updateDailyWage(Integer dailyWageId, DailyWage dailyWagedetails) throws ResourceNotFoundException {
		DailyWage dailyWage = dailyWageRepository.findById(dailyWageId)
				.orElseThrow(() -> new ResourceNotFoundException("Daily Wage not found for this id :: " + dailyWageId));
		
		return dailyWageRepository.save(dailyWage);
	}

	@Override
	public void deleteDailyWage(Integer dailyWageId) throws ResourceNotFoundException {
		DailyWage dailyWage = dailyWageRepository.findById(dailyWageId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + dailyWageId));

		dailyWageRepository.delete(dailyWage);		
	}
}
