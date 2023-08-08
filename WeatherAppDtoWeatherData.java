package com.sibaram.Weather_App.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sibaram.Weather_App.entity.WeatherData;

public interface WeatherAppDtoWeatherData  extends JpaRepository<WeatherData, Integer>{
	
}
