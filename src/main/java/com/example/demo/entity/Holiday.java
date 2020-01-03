package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="hs_hr_holidays")
@EntityListeners(AuditingEntityListener.class)


public class Holiday {
	@Id
	private int holiday_id;
	
	private String description;
	
	private String date;
	
	public int getHoliday_id() {
		return holiday_id;
	}

	public void setHoliday_id(int holiday_id) {
		this.holiday_id = holiday_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
