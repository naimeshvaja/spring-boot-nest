package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday, Integer> {
	
	 @Query(value = "select * from hs_hr_holidays where YEAR(date) = YEAR(DATE_SUB(CURDATE(), INTERVAL 1 YEAR)) AND location = :location ORDER BY date", nativeQuery=true)
	 List<Holiday> findHolidayByLocation(@Param("location") String location);
}
