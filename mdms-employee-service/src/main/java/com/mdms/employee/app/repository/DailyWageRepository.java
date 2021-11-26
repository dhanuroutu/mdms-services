package com.mdms.employee.app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdms.employee.app.entity.DailyWage;

@Repository
public interface DailyWageRepository extends JpaRepository<DailyWage, Integer>{

	List<DailyWage> findAllByDate(Date date);

}
