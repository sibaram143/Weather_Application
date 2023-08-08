package com.sibaram.Weather_App.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sibaram.Weather_App.entity.SearchWeather;

public interface WeatherAppDtoWeatherSearch extends JpaRepository<SearchWeather, Integer>{
	
//	public List<WeatherData> getAllWeatherData();
	
	
}
