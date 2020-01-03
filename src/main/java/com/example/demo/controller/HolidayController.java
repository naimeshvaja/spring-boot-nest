package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Holiday;
import com.example.demo.repository.HolidayRepository;

@RestController
@RequestMapping("/holiday")

public class HolidayController {
	@Autowired
	HolidayRepository holidayRepository;
	
	@GetMapping("/index")
	public List<Holiday> getAllHoliday(){
		return holidayRepository.findHolidayByLocation("Ahmedabad");
	}
}
